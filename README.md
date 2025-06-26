# Cognizant Digital Nurture 4.0 Assignment Solutions

Welcome to the Cognizant Digital Nurture 4.0 Assignment Solutions repository! This repository contains well-structured solutions to various programming assignments covering fundamental computer science concepts including data structures, algorithms, design patterns, and more.

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Maven (for dependency management)
- Git (for version control)
- PL/SQL environment (for Week 2 PL/SQL exercises)
- Your favorite Java IDE (IntelliJ IDEA, VS Code, Eclipse, etc.)

## 📁 Repository Structure

```
.
├── Week1_DataStructuresAndAlgorithms/
│   ├── Exercise2_EcommercePlatformSearchFunction/  # Search algorithms implementation
│   │   ├── code/
│   │   │   ├── BinarySearch.java     # Binary search implementation
│   │   │   ├── LinearSearch.java     # Linear search implementation
│   │   │   ├── Main.java            # Demo program for search functionality
│   │   │   └── Product.java         # Product class for e-commerce platform
│   │   └── output/                  # Sample outputs and screenshots
│   │
│   └── Exercise7_FinancialForecasting/  # Financial calculations
│       ├── code/
│       │   ├── FinancialTool.java   # Financial calculations
│       │   ├── ForecastTool.java    # Forecasting implementation
│       │   └── Main.java            # Demo program for financial tools
│       └── output/                  # Sample outputs and screenshots
│
├── Week1_DesignPrinciplesAndPattern/
│   ├── Exercise1_ImplementingtheSingletonPattern/  # Singleton pattern demo
│   │   ├── Code/
│   │   │   ├── Logger.java         # Singleton pattern implementation
│   │   │   └── SingletonTest.java   # Test class for Logger
│   │   └── Output/                 # Runtime examples and outputs
│   │
│   └── Exercise_2_ImplementingtheFactoryMethodPattern/  # Factory pattern demo
│       ├── Code/
│       │   ├── Document.java         # Document interface
│       │   ├── DocumentFactory.java # Factory interface
│       │   ├── ExcelDocument.java   # Excel document implementation
│       │   ├── ExcelDocumentFactory.java
│       │   ├── FactoryMethodTest.java
│       │   ├── PdfDocument.java     # PDF document implementation
│       │   ├── PdfDocumentFactory.java
│       │   ├── WordDocument.java    # Word document implementation
│       │   └── WordDocumentFactory.java
│       └── Output/                 # Runtime examples and outputs
│
├── Week2_PLSQLProgramming/                    # PL/SQL programming exercises
│   └── Week2_PLSQLProgramming_HandsOn.docx     # Documentation and exercises
│
├── Week2_SLF4Jloggingframework/               # Logging implementation
│   └── Exercise1_LoggingErrorMessagesandWarningLevels/
│       ├── Code/                # Logging implementation
│       └── Output/              # Log output examples
│
└── Week2_TDDusingJUnit5andMockito/           # Testing framework exercises
    ├── Exercise1_SettingUpJUnit/        # JUnit 5 setup and basics
    ├── Exercise2_AssertionsinJUnit/     # JUnit assertions
    ├── Exercise3_ArrangeActAssert/      # AAA pattern
    └── Exercise4_MockingandStubbing/    # Mockito framework
```

## 🛠️ How to Run

### Week 1: Data Structures and Algorithms

#### E-commerce Search
```bash
cd Week1_DataStructuresAndAlgorithms/Exercise2_EcommercePlatformSearchFunction/code
javac *.java
java Main
```

#### Financial Forecasting
```bash
cd Week1_DataStructuresAndAlgorithms/Exercise7_FinancialForecasting/code
javac *.java
java Main
```

### Week 1: Design Patterns

#### Singleton Pattern
```bash
cd Week1_DesignPrinciplesAndPattern/Exercise1_ImplementingtheSingletonPattern/Code
javac *.java
java SingletonTest
```

#### Factory Method Pattern
```bash
cd Week1_DesignPrinciplesAndPattern/Exercise_2_ImplementingtheFactoryMethodPattern/Code
javac *.java
java FactoryMethodTest
```

### Week 2: Testing with JUnit 5 and Mockito

#### Running JUnit Tests
```bash
# Navigate to any exercise directory, e.g.:
cd Week2_TDDusingJUnit5andMockito/Exercise1_SettingUpJUnit
mvn test
```

## 📚 Contents

### Week 1: Data Structures and Algorithms
- **E-commerce Platform Search**
  - Linear and Binary Search implementations
  - Product search functionality
  - Runtime complexity analysis

- **Financial Forecasting**
  - Revenue prediction models
  - Financial calculations and analysis

### Week 1: Design Principles and Patterns
- **Singleton Pattern**
  - Thread-safe Logger implementation
  - Global point of access

- **Factory Method Pattern**
  - Document creation framework
  - Support for multiple document types (Word, PDF, Excel)
  - Extensible design for new document types

### Week 2: Database Programming with PL/SQL
- Database programming concepts
- Stored procedures and functions
- Data manipulation and querying

### Week 2: Logging with SLF4J
- Logging best practices
- Error and warning level logging
- Log formatting and configuration

### Week 2: Testing with JUnit 5 and Mockito
- Unit testing fundamentals
- Test-driven development (TDD)
- Mocking and stubbing with Mockito
- Assertions and test organization

## 🤝 Contributing

1. Fork the repository
2. Create a new branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 📧 Contact

For any queries or suggestions, feel free to open an issue.

---

<div align="center">
  <sub>Built with ❤️ for Cognizant Digital Nurture 4.0 Program</sub>
</div>