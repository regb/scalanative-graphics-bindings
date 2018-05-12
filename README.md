# Graphics Bindings for Scala Native

This repository hosts [Scala Native](http://scala-native.org) bindings to the
popular graphics programming libraries SDL2 and OpenGL. With these, you can
develop high-performing graphical software, such as games, in your favorite
language.

The bindings are designed to reproduce as much as possible the original
programming interface in C. In particular, they won't hide Scala Native
interoperability types behind regular Scala types. These bindings are only
meant to provide access to these libraries for pure Scala Native projects. As
such, they expose the low-level details of the underlying API and they might
not be suitable for use in platforms that are not supported by Scala Native.
If you are looking for a truly cross-platform solution, the
[ScalaGL](https://github.com/samarion/scalagl) project aims to provide a
cross-platform (Native, JS, JVM) OpenGL wrapper. Alternatively, The [Scala Game
Library](http://github.com/regb/scala-game-library) is a complete 2D Scala game
engine with cross-platform support, which uses the SDL2 and OpenGL bindings for
its Scala Native backend implementation.

To get started, have a look at the [examples](/examples) folder containing
runnable demo projects. They demonstrate how to use the different librairies
and extensions.

## SDL2

Add the following line to your `build.sbt`:

    val sdl2 = ProjectRef(uri("git://github.com/regb/scalanative-graphics-bindings.git#COMMIT"), "sdl2")

Where `COMMIT` is the commit you want to link against (in doubt, take the last one). Then
you declare a dependency of your project to `sdl2`, by adding the `.dependsOn` call (see
this [build file](/examples/snake/build.sbt) for an example).

The bindings export most of SDL2 standard functionalities. Importing

    import sdl2.SDL._
    import sdl2.Extras._

is pretty much equivalent to

    #include "SDL.h"

SDL2 extensions can be provided as separate dependencies. Currently, we have an
implementation of `SDL2_image` and `SDL_ttf`, which can be included in your
project with, for example:

    val sdl2Image = ProjectRef(uri("git://github.com/regb/scalanative-graphics-bindings.git#COMMIT"), "sdl2Image")

For more documentation, you should refer to the official documentation of SDL,
as the bindings maintain almost the exact same interface.

## OpenGL

OpenGL functions up to 4.6 are exported.

Add the following line to your `build.sbt`:

    val opengl = ProjectRef(uri("git://github.com/regb/scalanative-graphics-bindings.git#COMMIT"), "opengl")

Where `COMMIT` is the commit you want to link against (in doubt, take the last one). Then
you declare a dependency of your project to `opengl`, by adding the `.dependsOn` call (see
this [build file](/examples/opengl-setup/build.sbt) for an example). You will also need to
add an additional linking option, which will vary depending on your system. For Linux, add
the following to your project:

      nativeLinkingOptions += "-lGL"

And for OSX, add the following instead:

      nativeLinkingOptions ++= Seq("-framework", "OpenGL")

The bindings export all of the OpenGL standard up to 4.6. Importing

    import opengl.GL._
    import opengl.Extras._

will bring all of the standard functions and definitions of OpenGL.

For more documentation, you should refer to the official documentation of
OpenGL, as the bindings maintain almost the exact same interface.

## OpenGL ES

Coming soon..
