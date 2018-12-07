val dottyVersion = "0.11.0-RC1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "dotty_exps",
    version := "0.1.0",

    scalaVersion := dottyVersion,

    libraryDependencies ++= Seq(
      "com.novocode" % "junit-interface" % "0.11" % "test"
    ) ++ Seq(
      "org.typelevel" %% "cats" % "0.9.0"
//      "org.scalamock" %% "scalamock-scalatest-support" % "3.6.0" % "test"
//      "org.scalactic" %% "scalactic" % "3.0.5" % "test",
//      "org.scalatest" %% "scalatest" % "3.0.5" % "test"
    ).map { dependency =>
      dependency.withDottyCompat(scalaVersion.value)
    }
  )
