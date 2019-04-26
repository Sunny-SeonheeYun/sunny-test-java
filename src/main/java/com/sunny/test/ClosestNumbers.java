package com.sunny.test;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ClosestNumbers {
    // Complete the closestNumbers function below.
    static int[] closestNumbers(int[] arr) {
        int[] sorted = insertionSort(arr);

        int min = Integer.MAX_VALUE;
        List<Integer> minIndexList = new ArrayList<>();
        for(int i=0; i<sorted.length-1; i++) {
            int diff = Math.abs(sorted[i] - sorted[i+1]);
            if(min > diff) {
                min = diff;
                minIndexList = new ArrayList<>();
                minIndexList.add(i);
            } else if(min == diff){
                minIndexList.add(i);
            }
        }

        if(minIndexList.size() > 0) {
            int[] result = new int[minIndexList.size() * 2 ];
            int index = 0;
            for(int i=0;i<minIndexList.size();i++) {
                result[index++] = sorted[minIndexList.get(i)];
                result[index++] = sorted[minIndexList.get(i)+1];
            }
            return result;
        } else {
            return null;
        }
    }

    private static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int standard = arr[i];  // 기준
            int aux = i - 1;   // 비교할 대상

            while (aux >= 0 && standard < arr[aux]) {
                arr[aux + 1] = arr[aux];   // 비교대상이 큰 경우 오른쪽으로 밀어냄
                aux--;
            }

            arr[aux + 1] = standard;  // 기준값 저장
        }

        return arr;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int dataCnt = 0;
        for (int i = 0; i < n; i++) {
            try {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
                dataCnt++;
            } catch(ArrayIndexOutOfBoundsException e) {
            }
        }

        if(n > dataCnt) {
            n = dataCnt;
            int[] arr_new = new int[n];
            for(int i= 0;i<dataCnt;i++) {
                arr_new[i] = arr[i];
            }
            arr = arr_new;
        }

        int[] result = closestNumbers(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
