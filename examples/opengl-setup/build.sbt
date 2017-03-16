lazy val sdl2 = ProjectRef(file("../.."), "sdl2")

lazy val opengl = ProjectRef(file("../.."), "opengl")

val OS = sys.props("os.name").toLowerCase
val LinuxName = "Linux"
val MacName = "Mac OS X"

def isLinux(name: String): Boolean = name.startsWith(LinuxName.toLowerCase)
def isMac(name: String): Boolean = name.startsWith(MacName.toLowerCase)

lazy val root = (project in file("."))
  .enablePlugins(ScalaNativePlugin)
  .settings(
    name         := "opengl-setup",
    version      := "0.1",
    scalaVersion := "2.11.8",
    scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature"),
    if(isLinux(OS))
      nativeLinkingOptions += "-lGL"
    else if(isMac(OS))
      nativeLinkingOptions ++= Seq("-framework", "OpenGL")
    else
      ???
  )
  .dependsOn(sdl2, opengl)
