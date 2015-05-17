# java-refactoring-ttc-viatra

VIATRA solution for the TTC 2015 Java Refactoring case.

## Projects

The solution consists of the following projects, each starting with the `hu.bme.mit.ttc.refactoring.` prefix:

* `model`: contains the type graph EMF model provided in the case and the extensions of our solutions.
* `patterns`: the patterns defined in EMF-IncQuery.
* `transformations`: the transformations defined in Xtend using the VIATRA framework.
* `solution`: the classes for building the program graph, performing the appropriate transformations and synchronising the source code with the new program graph.

## Getting started

The solution can be compiled with Apache Maven to a JAR file by issuing:

```bash
./build.sh
```

We provide a script to build the solution and invoke ARTE. To use this script, define a symbolic link in this directory to the ARTE.jar file.

```bash
ln -s <path-to-ARTE.jar>
```

To start ARTE, use the following command:

```bash
./run.sh
```

## Developer's guide

To use in Eclipse, install the following plug-ins:
* Xtend 2.8 ([Xtext update sites](https://www.eclipse.org/Xtext/download.html))
* EMF-IncQuery 1.0.0 ([EMF-IncQuery update sites](https://www.eclipse.org/incquery/download.php))
* VIATRA-EMF 0.7.0 ([VIATRA update sites](https://www.eclipse.org/viatra/downloads.php>))

## Paper

The benchmark solution is described in this [paper](https://github.com/FTSRG/paper-ttc15-java-refactoring).
