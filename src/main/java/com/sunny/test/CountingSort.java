package com.sunny.test;

import java.io.*;
import java.util.*;

public class CountingSort {

    // Complete the countingSort function below.
    static int[] countingSort(int[] arr) {
        int[] result = new int[arr.length];

        int[] occurrencesArray = new int[100];
        for(int i = 0;i< arr.length; i++ ) {
            int targetValue = arr[i];
            occurrencesArray[targetValue]++;
        }

//        return occurrencesArray;

        int resultIndex = 0;
        for(int i=0; i< occurrencesArray.length; i++) {
            int occurrence = occurrencesArray[i];
            for(int j=0;j<occurrence;j++) {
                result[resultIndex++] = i;
                System.out.print(i + " ");
            }
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = countingSort(arr);

//        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
//
//            if (i != result.length - 1) {
//                bufferedWriter.write(" ");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
