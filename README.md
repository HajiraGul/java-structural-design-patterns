# Java Structural Design Patterns

This repository provides simple Java examples demonstrating several structural design patterns. These patterns focus on how classes and objects are composed to form larger structures. The examples are designed for educational purposes, providing clear and concise implementations.

## Patterns Included

*   **Adapter Pattern:** Converts the interface of a class into another interface clients expect. The adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
*   **Composite Pattern:** Composes objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.
*   **Decorator Pattern:** Attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.
*   **Facade Pattern:** Provides a simplified interface to a complex subsystem. It makes the subsystem easier to use.
*   **Flyweight Pattern:** Uses sharing to support large numbers of fine-grained objects efficiently.
*   **Proxy Pattern:** Provides a surrogate or placeholder for another object to control access to it.

## Usage

Each pattern has its own package with a demo class containing a `main` method to run the example.

1.  **Clone the repository:**

    ```bash
    git clone [repository URL]
    ```

2.  **Navigate to the project directory:**

    ```bash
    cd [project directory]
    ```

3.  **Compile and run the examples (using a Java IDE like IntelliJ IDEA or Eclipse, or from the command line):**

    **Command line:**
    ```bash
    javac <package name>/<file name>.java
    java <package name>/<file name>
    ```

    **Example:**
    ```bash
    javac adapterpatterndemo/AdapterPatternDemo.java
    java adapterpatterndemo/AdapterPatternDemo
    ```

## Structure

*   `adapterpatterndemo/`: Contains Adapter Pattern example.
*   `compositepatterndemo/`: Contains Composite Pattern example.
*   `decoratorpatterndemo/`: Contains Decorator Pattern example.
*   `facadepatterndemo/`: Contains Facade Pattern example.
*   `flyweightpatterndemo/`: Contains Flyweight Pattern example.
*   `proxypatterndemo/`: Contains Proxy Pattern example.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please feel free to open an issue.
