package com.sunny.test.performance.bigo;

import scala.Console;

public class Test {
    public static void main(String[] args) {
        int input = 1000;

        Console.print("\nO(1)\t" + input + "\t -> " + new Constant().execute(input));
        Console.print("\nO(log n)\t" + input + "\t -> " + new Logarithmic().execute(input) + "\t\t" +  Math.log(input));
        Console.print("\nO(n)\t" + input + "\t -> " + new Linear().execute(input));
        Console.print("\nO(n2)\t" + input + "\t -> " + new Quadratic().execute(input));
        Console.print("\nO(n!)\t" + input + "\t -> " + new Factorial().execute(input));
 /*     O(1)	Constant	Determining if a number is even or odd; using a constant-size lookup table
        O(log n)	Logarithmic	Finding an item in a sorted array with a binary search
        O(n)	Linear	Finding an item in an unsorted list
        O(n2)	Quadratic	Bubble Sort (worst case or naive implementation)
        O(n!)	Factorial
*/
    }
}
