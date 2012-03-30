This project contains a simple unit spec with two copies of the same
example based on a JSON matcher.

        forall(1 to 1000) { _ =>
          json must */("hello" -> "dude") and */("hello" -> "dude")
        }

When running `sbt test`, one of the examples fails because a null
element is detected (JsonSpec.scala:20). We believe this bug was
related to the non-thread-safe design of
`scala.util.parsing.json.Parser`, discussed
[here](https://issues.scala-lang.org/browse/SI-4929). It made no
difference whether or not parallel test execution is disabled in the
build file.

This bug has been fixed as of
[specs2](https://github.com/etorreborre/specs2) 1.9-SNAPSHOT. Thank
you for the prompt response!
