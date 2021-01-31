val scala213 = "2.13.4"

ThisBuild / scalaVersion := scala213
ThisBuild / crossScalaVersions := Seq(scala213, "2.12.13", "2.11.12")

ThisBuild / publishTo := Some("releases"  at "https://oss.sonatype.org/service/local/staging/deploy/maven2")

lazy val commonSettings = Seq(
  organization   := "com.regblanc",
  scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature"),

  pomIncludeRepository := { _ => false },
  licenses := Seq("MIT-style" -> url("https://opensource.org/licenses/MIT")),
  homepage := Some(url("https://github.com/regb/scalanative-graphics-binding")),
  scmInfo := Some(
    ScmInfo(
      url("https://github.com/regb/scalanative-graphics-bindings"),
      "scm:git:git@github.com:regb/scalanative-graphics-bindings.git"
    )
  ),
  developers := List(
    Developer(
      id    = "regb",
      name  = "Regis Blanc",
      email = "regwblanc@gmail.com",
      url   = url("http://regblanc.com")
    )
  ),
  publishMavenStyle := true
)

lazy val sdl2 = (project in file("./sdl2"))
  .enablePlugins(ScalaNativePlugin)
  .settings(commonSettings: _*)
  .settings(
    name    := "native-sdl2",
    version := "0.2"
  )

lazy val sdl2Image = (project in file("./sdl2-image"))
  .enablePlugins(ScalaNativePlugin)
  .settings(commonSettings: _*)
  .settings(
    name := "native-sdl2-image",
    version := "0.2"
  )
  .dependsOn(sdl2)

lazy val sdl2Ttf = (project in file("./sdl2-ttf"))
  .enablePlugins(ScalaNativePlugin)
  .settings(commonSettings: _*)
  .settings(
    name := "native-sdl2-ttf",
    version := "0.2"
  )
  .dependsOn(sdl2)

lazy val opengl = (project in file("./opengl"))
  .enablePlugins(ScalaNativePlugin)
  .settings(commonSettings: _*)
  .settings(
    name := "native-opengl",
    version := "0.2"
  )

