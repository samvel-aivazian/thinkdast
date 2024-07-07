# ThinkDast

This repository contains my solutions to exercises from the book *Think Data Structures:
Algorithms and Information Retrieval in Java* by Allen B. Downey.
The book is published by Green Tea Press.

## Project Structure

This project is organized as a multimodule Maven project.
Each chapter or exercise from the book is implemented as a separate module.

### Modules Included

- [Chapter 1: Interfaces](chapter_1_interfaces/README.md)

## Requirements

- Java 21
- Maven 4.0.0+
- JUnit 5.10.2

## Build and Test

To build and test the entire project, navigate to the root directory and run:

```bash
mvn clean install
```

## Common Properties

The following properties are defined in the parent POM and are inherited by all modules:

- `maven.compiler.source`: 21
- `maven.compiler.target`: 21
- `project.build.sourceEncoding`: UTF-8
- `java.version`: 21
- `junit.version`: 5.10.2

## Common Dependencies

The following dependencies are included in the parent POM and inherited by all modules:

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <version>${junit.version}</version>
    <scope>test</scope>
</dependency>
```

## Acknowledgements

Special thanks to Allen B. Downey for his excellent book *Think Data Structures:
Algorithms and Information Retrieval in Java*.
This repository is based on the exercises and concepts presented in his book.
You can find the original repository and more of his work on his [GitHub page](https://github.com/AllenDowney).

For more information,
visit the [Think Data Structures repository](https://github.com/AllenDowney/ThinkDataStructures/tree/master).

## Notes

The code provided in this project represents my personal solutions to the exercises from the book.
These solutions are not exactly copied from the book;
instead, they incorporate clean code principles, best practices,
and proper test cases to ensure high-quality implementations.
This approach aims to provide a deeper understanding and practical application of the concepts covered in the book.

## License

This project is licensed under the MIT License — see the [LICENSE](LICENSE) file for details.