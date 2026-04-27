# Count Even, Odd, Positive, Negative and Zero in an Array

## Problem Statement
Write a Java program to count the number of:
- Even numbers
- Odd numbers
- Positive numbers
- Negative numbers
- Zeros

in a given array.

## Language
Java

## Algorithm
1. Read size of array.
2. Input array elements.
3. Initialize counters:
   - even
   - odd
   - positive
   - negative
   - zero
4. Traverse array:
   - If element is 0 → increment zero count.
   - If element > 0 → increment positive count.
   - If element < 0 → increment negative count.
   - If divisible by 2 → increment even count.
   - Otherwise → increment odd count.
5. Print all counts.

## UML Class Diagram
See `/UML` folder.
