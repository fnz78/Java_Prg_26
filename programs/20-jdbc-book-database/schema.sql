CREATE DATABASE db;
USE db;

CREATE TABLE Book (
    book_id INT PRIMARY KEY,
    book_name VARCHAR(100),
    author VARCHAR(100),
    book_type INT
);

INSERT INTO Book VALUES
(3001, 'The Alchemist', 'Paulo Coelho', 1001),
(3002, 'A Brief History of Time', 'Stephen Hawking', 1002),
(3003, 'Sapiens', 'Yuval Noah Harari', 1003),
(3004, 'Half Girlfriend', 'Chetan Bhagat', 1004);
