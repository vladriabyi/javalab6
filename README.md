# Java Lab 6

This repository contains the solution for laboratory work #6. The project implements a generic collection class that adheres to the `List` interface, utilizing an internal array that dynamically resizes when necessary.

## Description

In this lab work, we have implemented a custom collection class that behaves like a list but with additional features, such as dynamic resizing and multiple constructors. The main purpose of the project is to practice working with generics in Java, as well as with the `List` interface and dynamic memory management.

The collection starts with an initial capacity of 15 elements, and when the array is full, the size increases by 30%. This ensures efficient memory usage without unnecessary resizing.

## Features

- **Generic collection class**: The collection works with any object type (using generics).
- **Implements `List` interface**: Fully implements the methods of the `List` interface for standard collection operations.
- **Dynamic resizing**: The internal array automatically resizes by 30% when it reaches full capacity.
- **Multiple constructors**:
  - Default constructor.
  - Constructor that accepts one object.
  - Constructor that accepts a collection of objects.

## How to use

### 1. Clone the Repository

To get started, you need to clone the repository to your local machine. Open a terminal and run the following command:

```bash
git clone https://github.com/vladriabyi/javalab6.git
```

### 2. Navigate to the Project Directory
Once the repository is cloned, navigate to the project directory:

```bash
cd javalab6
```

### 3. Compile the Project
If you're using a terminal, you can compile the project using the javac command. This will compile all the Java files in the current directory:

```bash
javac *.java
```

### 4. Run the Project
After compiling, you can run the Main class, which contains the execution logic for the project:

```bash
java Main
```

### 5. Modify the Collection
In the Main class, you can see how the ResizableList class is used to store and manipulate objects. You can modify or extend the functionality by adding more operations to the ResizableList.
