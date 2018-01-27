Graphics Bindings for Scala Native
==================================

This repository hosts Scala Native bindings to the popular graphics programming
libraries SDL2 and OpenGL. The bindings try as much as possible to reproduce
the original programming interface in C. In particular, they won't hide
scalanative interoperability types behind regular Scala types.

These bindings are only meant to provide access to these libraries for pure
Scala Native projects. As such, they expose the low-level details of the API,
which might not necessarily make sense on a platform such as the JVM. If you
are looking for cross-platform solutions, the ScalaGL project aims to provide a
cross-platform (Native, JS, JVM) OpenGL wrapper. Alternatively, The [Scala Game
Library](http://github.com/regb/scala-game-library) is a complete 2D game
engine with cross-platform support, which uses these bindings for its native
backend implementation.

To get started, you can have a look at the [examples](/examples) folder,
containing runnable demo projects.

The bindings are still work in progress. For this reason, no artifact is published
yet. You can still easily add a dependency on your own project, using SBT  declarations
to depend on GIT repository:

    val sdl2 = ProjectRef(uri("git://github.com/regb/scalanative-graphics-bindings.git#COMMIT"), "sdl2")

SDL2
----

The bindings export most of SDL2 standard functionalities. Importing

    import sdl2.SDL._
    import sdl2.Extras._

is pretty much equivalent to

    #include "SDL.h"

There are a few missing exports, in particular most of `SDL_stdinc.h` is
ignored. Feel free to open an issue if you have a use case that requires more
of its content.

You can depend on the SDL2 bindings by adding the project to your `build.sbt`:

    val sdl2 = ProjectRef(uri("git://github.com/regb/scalanative-graphics-bindings.git#COMMIT"), "sdl2")

SDL2 extensions can be provided as separate dependencies. Currently, we
have an implementation of SDL2_image, which can be included in your project
with:

    val sdl2Image = ProjectRef(uri("git://github.com/regb/scalanative-graphics-bindings.git#COMMIT"), "sdl2Image")

For documentation, you should refer to the official documentation of SDL, as
these bindings simply forward all definitions.

OpenGL
------

OpenGL functions up to 3.2 are exported.
