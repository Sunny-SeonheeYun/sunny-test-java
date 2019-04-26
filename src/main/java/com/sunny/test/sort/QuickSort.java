package com.sunny.test.sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10, 2, 6, 4, 3, 7, 5};
//        int[] arr = {1, 1, 2, 2, 3, 3, 5, 5, 7, 7, 9, 9};
//        int[] arr = {10,9,8,7,6,5,4,3,2,1};

        quickSort(arr);
    }

    public static void quickSort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int low, int high) {
        if (low >= high) return;

        int mid = partition(arr, low, high);
        printArr(arr, " sort1    ");
        sort(arr, low, mid - 1);
        printArr(arr, " sort2    ");
        sort(arr, mid, high);
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[(low + high) / 2];
        while (low <= high) {
            while (arr[low] < pivot) low++;
            while (arr[high] > pivot) high--;
            if (low <= high) {
                swap(arr, low, high);
                low++;
                high--;
            }
        }
        printArr(arr, " partition");
        return low;
    }

    private static int i = 0;
    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        printArr(arr, " swap     ");
    }

    private static void printArr(int[] arr) {
        printArr(arr, "");
    }
    private static void printArr(int[] arr, String msg) {
        System.out.print(++i + msg + "\t : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
