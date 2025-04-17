# Composite

## Definition
- The **Composite Design Pattern** is a structural design pattern used for composing objects into tree structures to represent part-whole hierarchies.
- It allows individual objects (leaves) and compositions of objects (composites) to be treated uniformly.
- Clients can interact with both single objects and compositions of objects through the same interface.
- It helps in building more flexible and extensible systems by ensuring that client code treats complex and simple objects in the same way.

## Use Cases
- **Graphical Systems**
    - Complex shapes made up of simpler shapes.
    - Treat both simple shapes (e.g., a line) and complex shapes (e.g., a picture) uniformly.
- **File Systems**
    - Hierarchy of directories and files.
    - A directory can contain files or other directories.
    - Simplifies traversing and managing the file system.
- **Menus**
    - Menus containing both menu items and sub-menus in graphical user interfaces.
    - Treat both menu items and sub-menus uniformly.
- **Organizational Hierarchies**
    - Represent hierarchical structures such as employees and managers.
    - Allows for easy querying and modification.

## Implementation Details

![Base structure - class diagram](./diagram/composite-base structure.svg)

- **Component Interface**
    - Define an interface or an abstract class for common operations for both simple and composite objects.
- **Leaf**
    - Create a class implementing the component interface.
    - Represents simple objects that don't have subcomponents.
- **Composite**
    - Create another class implementing the component interface.
    - Able to store child components.
    - Typically has methods to add, remove, or get child components.
- **Client Code**
    - Interacts with the component interface without knowing whether it’s dealing with a leaf or a composite component.
    - Allows for greater flexibility and easier extension of the system.

## What to Avoid
- **Overuse**
    - Avoid using the Composite Pattern when the hierarchy isn’t core to the domain.
    - Unnecessary use can add complexity.
- **Performance Issues**
    - Be cautious as the composite structure grows; performance issues can arise if the tree structure is deep.
    - Optimize traversal and other operations.
- **Violation of the Single Responsibility Principle**
    - The Composite Pattern can sometimes make the Composite class too complex.
    - Ensure classes remain focused and don’t take on too many responsibilities.
- **Ignoring Leaf-Composite Distinctions**
    - There are operations that make sense for Composite objects but not for Leaf objects.
    - Handle such cases properly to avoid inappropriate behavior.


## Class diagram of aRPG' inventory (game analogy)

![aRPG Inventory - class diagram](./diagram/composite-inventory.svg)