<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&weight=600&size=28&pause=1000&color=ED8B00&center=true&vCenter=true&width=600&lines=Java+Abstract+Classes;Object+Oriented+Programming;Clean+Architecture+Reference" alt="Typing SVG" />
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/Design%20Patterns-Template%20Method-blue?style=for-the-badge" alt="Design Patterns" />
  <img src="https://img.shields.io/badge/Architecture-Modular-2ea44f?style=for-the-badge" alt="Architecture" />
  <img src="https://img.shields.io/badge/Quality-Production%20Ready-success?style=for-the-badge" alt="Production Ready" />
  <img src="https://img.shields.io/badge/Maintained%3F-yes-green.svg?style=for-the-badge" alt="Maintained" />
  <img src="https://img.shields.io/badge/Made%20with-❤-red.svg?style=for-the-badge" alt="Love" />
</p>

<p align="center">
  <img width="240" src="https://raw.githubusercontent.com/rahulbanerjee26/githubProfileReadmeGenerator/main/icons/java.svg" alt="Java OOP Logo" />
</p>

<h1 align="center">
  <img width="40" src="https://user-images.githubusercontent.com/74038190/216122041-518ac897-8d92-4c6b-9333-26323429076d.gif" /> 
  Java Abstract Classes Reference Implementation
  <img width="40" src="https://user-images.githubusercontent.com/74038190/216122041-518ac897-8d92-4c6b-9333-26323429076d.gif" />
</h1>

<p align="center">
  Enterprise-grade demonstration of Object-Oriented Programming principles, inheritance hierarchies, polymorphism and clean architecture using abstract classes.
</p>

<p align="center">
  <img src="https://user-images.githubusercontent.com/74038190/225813708-98b745f2-7d22-48cf-9150-083f1b00d6c9.gif" width="700" alt="Code Animation" />
</p>

<p align="center">
  <img width="60" src="https://user-images.githubusercontent.com/74038190/212257467-871d32b7-e401-42e8-a188-1676121236b1.gif" />
  <img width="60" src="https://user-images.githubusercontent.com/74038190/212257465-7ce8d493-cac5-494e-982a-5a9deb852c4b.gif" />
  <img width="60" src="https://user-images.githubusercontent.com/74038190/212257468-1e9a91f1-b626-4baa-b15d-5c385dfa7ed2.gif" />
  <img width="60" src="https://user-images.githubusercontent.com/74038190/212257460-738ff738-247f-4445-a718-cdd0ca76e2db.gif" />
  <img width="60" src="https://user-images.githubusercontent.com/74038190/212257472-08e52665-c50f-44e2-87d6-962521858713.gif" />
</p>

---

<div align="center">
  <img height="40" src="https://user-images.githubusercontent.com/74038190/216125640-279cb871-6e9c-4e88-95a5-c0b0612e6299.gif" />
</div>

## 🎯 Project Overview

This is a production-ready reference implementation demonstrating proper usage of **Abstract Classes** in Java. It serves as an educational resource and architectural template for building maintainable object-oriented systems.

The project implements two independent domain models following strict OOP principles, clean separation of concerns, and industry best practices.

> 💡 **Core Philosophy**: Abstract classes define contracts. Concrete implementations fulfill those contracts. Polymorphism allows systems to be extended without modification.

---

<div align="center">
  <img height="45" src="https://user-images.githubusercontent.com/74038190/216122065-2f028bae-25d6-4a3c-bc9f-175394ed5011.gif" />
</div>

## ✨ Core Features

| Feature | Implementation Status |
|---------|------------------------|
| ✅ **Abstract Base Classes** | Contract definition with shared implementation |
| ✅ **Template Method Pattern** | Base class logic using abstract method implementations |
| ✅ **Runtime Polymorphism** | Full dynamic dispatch demonstration |
| ✅ **Inheritance Hierarchies** | Multi-level inheritance with proper specialization |
| ✅ **Immutable Value Objects** | Thread-safe coordinate system implementation |
| ✅ **Final Classes** | Preventing improper inheritance |
| ✅ **Encapsulation** | Proper access modifier usage |
| ✅ **Domain Separation** | Modular package architecture |
| ✅ **Polymorphic Collections** | Heterogeneous collections with uniform interface |

---

<div align="center">
  <img height="50" src="https://user-images.githubusercontent.com/74038190/221352989-518609ab-b4d1-4596-9e45-03703b3f426f.gif" />
</div>

## 🏗️ System Architecture

### Class Hierarchy Diagram

```mermaid
classDiagram
    direction BT
    %% ==============================================
    %% GEOMETRY DOMAIN
    %% ==============================================
    class Point3D {
        <<Immutable>>
        - double x
        - double y
        - double z
        + Point3D(x, y, z)
        + move(double dx, double dy, double dz)
        + getX() double
        + getY() double
        + getZ() double
    }

    class Shape {
        <<Abstract>>
        # Point3D center
        # double materialDensity
        + move(Point3D newPosition)
        + calculateWeight() double
        + calculateSurface()* double
        + calculateVolume()* double
    }

    class Brick {
        - double width
        - double length
        - double height
        + Brick(center, density, w, l, h)
        + calculateSurface() double
        + calculateVolume() double
    }

    class Cube {
        <<Final>>
        + Cube(center, density, side)
        + calculateSurface() double
        + calculateVolume() double
    }

    %% ==============================================
    %% HUMAN RESOURCES DOMAIN
    %% ==============================================
    class Employee {
        <<Abstract>>
        # String lastName
        # String firstName
        # int age
        # LocalDate hireDate
        + toString() String
        + getJobTitle()* String
        + calculateMonthlySalary()* double
    }

    class Technician {
        - int unitsProduced
        + getJobTitle() String
        + calculateMonthlySalary() double
    }

    class Salesperson {
        - double monthlyRevenue
        + getJobTitle() String
        + calculateMonthlySalary() double
    }

    class Representative {
        - double monthlyRevenue
        + getJobTitle() String
        + calculateMonthlySalary() double
    }

    class WarehouseHandler {
        - int workedHours
        + getJobTitle() String
        + calculateMonthlySalary() double
    }

    %% ==============================================
    %% RELATIONSHIPS
    %% ==============================================
    Point3D *-- Shape
    Shape <|-- Brick : Inheritance
    Brick <|-- Cube : Specialization
    Employee <|-- Technician
    Employee <|-- Salesperson
    Employee <|-- Representative
    Employee <|-- WarehouseHandler

    note for Shape "Abstract methods force concrete implementations\nto provide domain-specific calculation logic"
    note for Employee "Common properties implemented once\n@see Template Method Pattern"
    note for Cube "Final class prevents further inheritance\nThis class has no valid specializations"
```

---

<div align="center">
  <img height="55" src="https://user-images.githubusercontent.com/74038190/219923809-b86dc415-a0c2-4a38-bc88-ad6cf06395a8.gif" />
</div>

## 🔬 Code Deep Dive

### 1. Abstract Base Class Implementation

```java
public abstract class Shape {
    // Shared state - inherited by all subclasses
    protected Point3D center;
    protected double materialDensity;

    // Concrete method - implemented ONCE for all shapes
    public final double calculateWeight() {
        // Template Method Pattern: uses abstract method
        return calculateVolume() * materialDensity;
    }

    // Abstract method - CONTRACT: all shapes must implement
    public abstract double calculateSurface();
    public abstract double calculateVolume();
}
```

> ✅ **Best Practice**: Abstract classes contain shared state and shared implementation while defining a mandatory contract for subclasses.

### 2. Polymorphic Usage

```java
// Heterogeneous collection - all elements implement Shape contract
List<Shape> shapes = Arrays.asList(
    new Brick(origin, 7.8, 10, 20, 30),
    new Cube(origin, 2.7, 15),
    new Brick(origin, 11.3, 5, 5, 10)
);

// Uniform interface for ALL shapes
for (Shape shape : shapes) {
    System.out.printf(
        "Weight: %.2fg | Surface: %.2fcm²%n",
        shape.calculateWeight(),
        shape.calculateSurface()
    );
}
```

> 🎯 **Key Insight**: New shape types can be added (Sphere, Cylinder, Pyramid) without modifying any existing code. This is the **Open/Closed Principle** in action.

### 3. Employee Salary Calculation

| Role | Formula | Implementation Location |
|------|---------|--------------------------|
| Technician | `unitsProduced × 5` | `Technician.java:42` |
| Salesperson | `monthlyRevenue × 0.20` | `Salesperson.java:38` |
| Representative | `(monthlyRevenue × 0.20) + 2000` | `Representative.java:38` |
| Warehouse Handler | `workedHours × 500` | `WarehouseHandler.java:36` |

All implementations satisfy the `calculateMonthlySalary()` contract defined in the abstract `Employee` class.

---

<div align="center">
  <img height="50" src="https://user-images.githubusercontent.com/74038190/212748830-4c709398-a386-4761-84d7-9e10b98fbe6e.gif" />
</div>

## 🚀 Installation & Execution

### System Requirements
- Java JDK 17+
- Maven 3.8+ (optional)

### Quick Start

```bash
# Clone repository
git clone https://github.com/yourorganization/java-oop-abstract-classes.git
cd java-oop-abstract-classes

# Compile all sources
javac -d target -sourcepath src src/ma/projectclasse/**/*.java

# Execute Geometry Demo
java -cp target ma.projectclasse.projects.shapes.Main

# Execute HR Demo
java -cp target ma.projectclasse.projects.company.Main
```

---

<div align="center">
  <img height="45" src="https://user-images.githubusercontent.com/74038190/216644487-64f22e06-56e0-4bd9-a617-9b3de291214d.gif" />
</div>

## 📊 Design Patterns Demonstrated

| Pattern | Implementation |
|---------|----------------|
| **Template Method** | `Shape.calculateWeight()`, `Employee.toString()` |
| **Polymorphism** | All abstract method invocations |
| **Immutable Object** | `Point3D` class |
| **Contract Design** | Abstract base classes as interfaces |
| **Specialization** | `Cube` extending `Brick` |

---

## 📐 Architectural Principles Applied

1. **Single Responsibility**: Each class has exactly one reason to change
2. **Open/Closed**: System open for extension, closed for modification
3. **Liskov Substitution**: Subtypes are substitutable for base types
4. **Interface Segregation**: No class is forced to implement unnecessary methods
5. **Dependency Inversion**: High-level modules depend on abstractions

---

## 📁 Project Structure

```
src/
└── ma/
    └── projectclasse/
        └── projects/
            ├── shapes/                     Geometry Domain
            │   ├── Point3D.java            Immutable coordinate
            │   ├── Shape.java              Abstract base contract
            │   ├── Brick.java              Rectangular prism
            │   ├── Cube.java               Specialized brick
            │   └── Main.java               Demo entry point
            └── company/                    Human Resources Domain
                ├── Employee.java           Abstract base contract
                ├── Technician.java         Production role
                ├── Salesperson.java        Sales role
                ├── Representative.java     Senior sales role
                ├── WarehouseHandler.java   Logistics role
                └── Main.java               Demo entry point
```

---

<div align="center">
  <img height="50" src="https://user-images.githubusercontent.com/74038190/216649426-0c2ee823-9193-4e8d-b03f-73bf28cceb28.gif" />
</div>

## 🤝 Contribution Guidelines

```mermaid
flowchart LR
    A[Fork] --> B[Feature Branch]
    B --> C[Implement Changes]
    C --> D[Add Tests]
    D --> E[Verify Standards]
    E --> F[Pull Request]
    F --> G[Code Review]
    G --> H[Merge]

    style A fill:#6cf,stroke:#333
    style H fill:#6c6,stroke:#333
```

### Contribution Rules
- Maintain existing code style and conventions
- All public methods require Javadoc documentation
- Write unit tests for new functionality
- Ensure 100% of existing tests pass
- Keep commits atomic and descriptive

---

<div align="center">
  <img height="50" src="https://user-images.githubusercontent.com/74038190/216649417-9acc58df-9186-4135-ad40-9797259259c1.gif" />
</div>

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for full details.

<p align="center">
  <img src="https://img.shields.io/badge/License-MIT-yellow.svg?style=for-the-badge" alt="License" />
</p>

---

<p align="center">
  <img width="30" src="https://user-images.githubusercontent.com/74038190/216649430-0a912308-4e85-4f49-9d14-0d9586939836.gif" />
  Reference Implementation 
  <img width="20" src="https://user-images.githubusercontent.com/74038190/216649436-05c6a71f-0d0a-4069-99d3-43c65831ab9f.gif" />
  Enterprise Quality 
  <img width="20" src="https://user-images.githubusercontent.com/74038190/216649436-05c6a71f-0d0a-4069-99d3-43c65831ab9f.gif" />
  Educational Resource
  <img width="30" src="https://user-images.githubusercontent.com/74038190/216649430-0a912308-4e85-4f49-9d14-0d9586939836.gif" />
</p>

<p align="center">
  <img src="https://user-images.githubusercontent.com/74038190/212284100-561aa473-3905-4a80-b561-0d28506553ee.gif" width="700" />
</p>
