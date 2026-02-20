# Polymorphism Template

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=flat-square)

A Java exercise template for learning polymorphism through method overloading and method overriding.

## Overview

This project serves as a hands-on lab template for students to practice two key forms of polymorphism in Java. It includes a partially completed codebase with guided steps for implementing method overloading in a `Calculator` class and method overriding across a shape class hierarchy.

## Features

- **Method Overloading** -- Multiple `add` and `subtract` methods with different parameter signatures in the `Calculator` class
- **Method Overriding** -- Shape hierarchy with `TwoDShape` base class and `Circle` and `Triangle` subclasses that override the `findArea()` method
- Gitpod-ready configuration for cloud-based development
- Structured Java package layout (`ie.gmit.overloading`, `ie.gmit.overriding`)

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- A Java IDE or text editor (VS Code with Java Extension Pack recommended)
- Git

## Getting Started

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/danielcregg/polymorphism-template.git
   cd polymorphism-template
   ```

2. Alternatively, open directly in Gitpod by prefixing the repo URL with `https://gitpod.io/#`.

### Usage

**Overloading Exercise:**

1. Add a `main` method to the `Main` class and print "Hello" to the console.
2. Complete the `add` and `subtract` methods in the `Calculator` class by implementing the missing calculations.
3. Create a `Calculator` object in the `main` method and call all `add` and `subtract` methods.
4. Stage, commit, and push your code.

**Overriding Exercise:**

1. Review the `TwoDShape` base class with its `findArea()` method.
2. Examine how `Circle` and `Triangle` override the `findArea()` method with shape-specific calculations.
3. Create an object of each shape class in `main` and call their `findArea()` methods.
4. Stage, commit, and push your code.

**Compile and run:**
```bash
javac -d . Main.java ie/gmit/overloading/*.java ie/gmit/overriding/*.java
java Main
```

## Tech Stack

- **Java** -- Object-oriented programming language
- **Gitpod** -- Cloud-based development environment

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
