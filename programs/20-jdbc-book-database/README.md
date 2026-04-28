# JDBC Book Database using Java

## Problem statement

To create a Java JDBC program that connects to a MySQL database, retrieves records from the `Book` table, and displays the book ID and book name.

## language

java

## Algorithm

1. Start the program.
2. Import `java.sql` package.
3. Load MySQL JDBC driver using `Class.forName()`.
4. Establish connection to MySQL database using `DriverManager.getConnection()`.
5. Create a `Statement` object.
6. Execute SQL query `SELECT * FROM Book`.
7. Store the result in a `ResultSet` object.
8. Traverse each record using `while(rs.next())`.
9. Retrieve `book_id` and `book_name` using `getInt()` and `getString()`.
10. Display the retrieved values.
11. Close the database connection.
12. Stop.

## UML Diagram

See `UML/class-diagram.puml`
