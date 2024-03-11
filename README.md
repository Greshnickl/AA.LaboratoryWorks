# Fibonacci Algorithms in Java

This Java program implements various algorithms for calculating Fibonacci numbers, including recursive, iterative, matrix exponentiation, memoization, Binet's formula, and bottom-up dynamic programming approaches.

## Introduction

The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1. These algorithms provide different ways to efficiently compute Fibonacci numbers for a given input.

## Usage

To run the program, compile the `Main.java` file and execute the generated `.class` file:

```bash
javac Main.java
java Main
```

The program will output the execution times of each algorithm for predefined input sizes.

## Algorithms Implemented

- **Recursive Approach**: Computes Fibonacci numbers recursively.
- **Iterative Approach**: Computes Fibonacci numbers using a loop.
- **Matrix Exponentiation**: Computes Fibonacci numbers using matrix exponentiation.
- **Memoization**: Computes Fibonacci numbers with memoization to avoid redundant calculations.
- **Binet's Formula**: Computes Fibonacci numbers using Binet's formula.
- **Bottom-Up Dynamic Programming**: Computes Fibonacci numbers using bottom-up dynamic programming.

# Sorting Algorithms Comparison

This Java program compares the performance of various sorting algorithms including QuickSort, HeapSort, MergeSort, and CountSort using different input sizes. It generates random arrays of integers and measures the execution time for sorting each array with different algorithms.

## Overview

The program aims to provide insights into the efficiency and performance characteristics of different sorting algorithms. It generates arrays of varying sizes and records the time taken by each sorting algorithm to sort these arrays. The results are then visualized using a line chart to compare the execution times of different algorithms for different input sizes.

## Usage

To use this program, follow these steps:

1. Compile and run the `Main.java` file.
2. The program will generate random arrays of integers with different sizes.
3. It will then measure the execution time for sorting each array using QuickSort, HeapSort, MergeSort, and CountSort.
4. Finally, it will display a chart comparing the execution times of these sorting algorithms for different input sizes.

## Sorting Algorithms

### QuickSort
- QuickSort is a widely used sorting algorithm known for its efficiency and average-case performance of O(n log n).
- It works by selecting a 'pivot' element from the array and partitioning the other elements into two sub-arrays according to whether they are less than or greater than the pivot.
- The process is then recursively applied to the sub-arrays.

### HeapSort
- HeapSort is a comparison-based sorting algorithm that operates by first building a heap from the input array and then repeatedly extracting the maximum element from the heap and rebuilding the heap until the array is sorted.
- It has a time complexity of O(n log n) and is often used for its stability and guaranteed worst-case performance.

### MergeSort
- MergeSort is a divide-and-conquer sorting algorithm that divides the input array into two halves, recursively sorts each half, and then merges the sorted halves.
- It has a time complexity of O(n log n) and is known for its stable sorting behavior.

### CountSort
- CountSort is a non-comparison-based sorting algorithm that operates by counting the number of occurrences of each unique element in the input array and then reconstructing the sorted array based on these counts.
- It has a time complexity of O(n + k), where k is the range of the input, making it efficient for sorting integers when the range is relatively small compared to the size of the array.

## Visualization

The program utilizes JFreeChart to create a line chart visualizing the execution times of different sorting algorithms for varying input sizes. The x-axis represents the input size, while the y-axis represents the execution time in nanoseconds. Each line on the chart represents a different sorting algorithm, allowing for easy comparison of their performance.
