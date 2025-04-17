# Builder pattern

The builder pattern is a design pattern designed to provide a flexible solution to various object creation problems in object-oriented programming. The intent of the builder design pattern is to separate the construction of a complex object from its representation. It is one of the Gang of Four design patterns.

### Intent

The intent of the Builder design pattern is to separate the construction of a complex object from its representation. 
By doing so, the same construction process can create different representations.

### Advantages
* Allows you to vary a product's internal representation.
* Encapsulates code for construction and representation.
* Provides control over steps of construction process.

### Disadvantages
* A distinct ConcreteBuilder must be created for each type of product.
* Builder classes must be mutable.
* May hamper/complicate dependency injection.

## General diagram of Builder

![Builder - general diagram](diagram/builder_diagram.svg)


