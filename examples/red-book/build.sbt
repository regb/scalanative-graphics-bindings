lazy val sdl2 = ProjectRef(file("../.."), "sdl2")
lazy val sdl2Image = ProjectRef(file("../.."), "sdl2Image")
lazy val opengl = ProjectRef(file("../.."), "opengl")

val OS = sys.props("os.name").toLowerCase
val LinuxName = "Linux"
val MacName = "Mac OS X"

def isLinux(name: String): Boolean = name.startsWith(LinuxName.toLowerCase)
def isMac(name: String): Boolean = name.startsWith(MacName.toLowerCase)

lazy val root = (project in file("."))
  .enablePlugins(ScalaNativePlugin)
  .settings(
    name         := "red-book",
    version      := "0.1",
    scalaVersion := "2.11.12",
    scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature"),
    if(isLinux(OS))
      nativeLinkingOptions += "-lGL"
    else if(isMac(OS))
      nativeLinkingOptions ++= Seq("-framework", "OpenGL")
    else
      ???
  )
  .dependsOn(sdl2, sdl2Image, opengl)
