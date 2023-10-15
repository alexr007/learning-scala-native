Global / onChangedBuildSource := ReloadOnSourceChanges

ThisBuild / organization := "org.alexr"
ThisBuild / scalaVersion := "2.13.12"

lazy val ce3native = project
  .in(file("."))
  .enablePlugins(ScalaNativePlugin)
  .settings(
    libraryDependencies ++= Seq(
      "co.fs2" %%% "fs2-io" % "3.9.2"
    ),
    Compile / mainClass := Some("app.Main")
  )
