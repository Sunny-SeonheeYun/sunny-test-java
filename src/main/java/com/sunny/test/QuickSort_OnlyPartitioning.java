package com.sunny.test;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class QuickSort_OnlyPartitioning {

    // http://email.postmaster.hackerrankmail.com/c/eJyFUdtugzAM_Rr6VpQ4F8gDD1M7fgO5iSkIQqoQ1PXvF9ppmiZNiyIlPvaxj45dY7RGOIwNMG6Y5MAYAwYlL0_8dG6FFOZdyHdlToVkt7Amj2uiWA5oJ4oRl8njOJc2-MPQ9FRLqU3PSDkksBKZtT2rXV2TVJwf5mZI6VaItwLafO_3-49Ge5MM4paG_LzwLpIbI9lUiNaGJdFH_p0FOzp8rMfQH21w1NGuoQD9xRldrlHGaKV4Rid65JjXiFywSkrn-ouESl-4qCsARw654oxLEo7VmZBGT2tCf9tpSimotQLYEyEjBSho7YDzTMuV1meYBYUbRUwh7oBohy7u7_lLmQK9LXOwU5fCRMszVSNVlVRAF0P5YCVUpXtx0WBcbyT12UGBmr3YyXc2K8Lx-mIL1u0WdKHvnhbs5ozLFrb1u95n6zb_W0ZOrGGLlp4Jl_FHNtmPi6N4iM1KYRmIyse25IVfv5ebmr8n7jj8V_Fzzif_1su5
    static int[] quickSort(int[] arr) {
        int pivot = arr[0];
        int[] left = new int[arr.length - 1];
        int[] equal = new int[arr.length - 1];
        int[] right = new int[arr.length - 1];
        int len_l = 0, len_e = 0, len_r = 0;

        for(int i=0; i < arr.length; i++) {
            if(arr[i] < pivot) {
                left[len_l++] = arr[i];
            } else if(arr[i] > pivot) {
                right[len_r++] = arr[i];
            } else {
                equal[len_e++] = arr[i];
            }
        }

        int[] result = new int[arr.length];
        int len_result = 0;
        for(int i=0;i<len_l;i++)   result[len_result++] = left[i];
        for(int i=0;i<len_e;i++)   result[len_result++] = equal[i];
        for(int i=0;i<len_r;i++)   result[len_result++] = right[i];

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
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

        int[] result = quickSort(arr);

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

