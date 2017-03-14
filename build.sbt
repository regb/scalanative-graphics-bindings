lazy val commonSettings = Seq(
  version      := "0.1",
  scalaVersion := "2.11.8",
  scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")
)

lazy val sdl2 = (project in file("./sdl2"))
  .enablePlugins(ScalaNativePlugin)
  .settings(commonSettings: _*)
  .settings(
    name := "sdl2"
  )

lazy val sdl2Image = (project in file("./sdl2-image"))
  .enablePlugins(ScalaNativePlugin)
  .settings(commonSettings: _*)
  .settings(
    name := "sdl2-image"
  )
  .dependsOn(sdl2)
