package com.sunny.test;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.IntStream;

public class InsertionSort_MoveCnt {

    // Complete the runningTime function below.
    static int runningTime(int[] arr) {
        int cnt = 0;

        for(int i = 1;i<arr.length;i++) {
            int target = arr[i];
            int index = i - 1;

            while(index>=0 && target < arr[index]) {
                arr[index + 1] = arr[index];
                index--;
                cnt++;
            }
            arr[index + 1] = target;

            System.out.println(i);
            for(int j=0;j<arr.length;j++)   System.out.print(arr[j] + " ");
            System.out.println();
        }

        return cnt;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = runningTime(arr);

        System.out.println(result);

        scanner.close();
    }
}
