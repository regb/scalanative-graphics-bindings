lazy val sdl2 = ProjectRef(file("../.."), "sdl2")
lazy val sdl2Ttf = ProjectRef(file("../.."), "sdl2Ttf")

lazy val root = (project in file("."))
  .enablePlugins(ScalaNativePlugin)
  .settings(
    name         := "fonts",
    version      := "0.1",
    scalaVersion := "2.13.4",
    scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")
  )
  .dependsOn(sdl2, sdl2Ttf)
