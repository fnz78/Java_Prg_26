#  Java Programming Lab 26

##  Overview

This repository contains a collection of Java programs developed during my university coursework while pursuing **MSc Computer Science**.

The programs demonstrate core programming concepts such as:

- Object-Oriented Programming
- Control Statements
- Loops and Arrays
- Exception Handling
- File Handling
- GUI Programming using Swing
- Database Connectivity using JDBC

These exercises helped strengthen my problem-solving, logic building, and application development skills in Java.

---

##  Learning Goals

- ✔ Understand Java programming fundamentals  
- ✔ Implement Object-Oriented Programming concepts  
- ✔ Work with Java GUI applications  
- ✔ Connect Java applications to databases  
- ✔ Build practical lab-based programs  

---

##  Topics Covered

### 🔹 Basic Programs
- Prime Number  
- Fibonacci Series  
- Factorial Calculation  
- Number Operations  

### 🔹 Object Oriented Programming
- Classes and Objects  
- Inheritance  
- Method Overloading  
- Encapsulation  

### 🔹 Exception Handling
- Try-Catch Blocks  
- Custom Exceptions  

### 🔹 File Handling
- Reading files  
- Writing files  

### 🔹 GUI Programs
- Java Swing Applications  
- Forms and Components  

### 🔹 Database Connectivity
- JDBC Connection  
- Table Creation  
- Display Database Records using JTable  

---
---

##  Technologies Used

| Technology | Purpose |
|----------|--------|
| Java | Programming Language |
| JDBC | Database Connectivity |
| Swing | GUI Development |
| MySQL | Database |

---

##  How to Run the Programs

1️⃣ Clone the Repository  
```bash
git clone https://github.com/yourusername/java-programs.git
```
2️⃣ Navigate to the Folder
```bash
cd java-programs
```

3️⃣ Compile the Program
```bash
javac ProgramName.java
```

4️⃣ Run the Program
```bash
java ProgramName
```

 Database Setup (For JDBC Programs)

Create a database in MySQL:
```bash

CREATE DATABASE javaprograms;
```

Update database credentials in the Java program:
```bash

Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/javaprograms",
    "root",
    "password"
);
```

 Sample Output

Example: 

Prime Number Program

Enter number of primes: 5
Prime numbers are:
2 3 5 7 11

---
## 👨‍💻 Author

fnz78

---
⭐ If you find this useful
Give the repository a star ⭐ and feel free to explore the programs
