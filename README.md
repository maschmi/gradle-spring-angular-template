# How to setup a gradle build

We all know the long and full `gradle.build` files in projects getting older. First the project may start with a simple build file, maybe even a generated one. With time, more and more dependencies, plugins and configuration - maybe even own tasks are put into the single build file.

This repository shows how to to it different and better maintainable frome the beginning.

## What is shown?

The goal is to show:
* Gradle composite build with
  * SpringBoot application
  * Angular Application (not yet done)
* Usage of
  * Convetion plugin projects to centralize build logic and build structure
  * Platfrom projects to centralize dependency versions

## Special thank you

While the idea spooked in my mind for a year or so [this video series](https://www.youtube.com/watch?v=Ajs8pTbg8as&list=PLWQK2ZdV4Yl2k2OmC_gsjDpdIBTN0qqkE) by Jendrik Johannes gave me a real productivity bump. This together with the official gradle documenation seems to make exploring gradle in more depth much more joy as only the official documentation.
