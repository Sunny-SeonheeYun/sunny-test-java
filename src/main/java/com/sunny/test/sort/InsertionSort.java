package com.sunny.test.sort;

public class InsertionSort {
    public static int moveCnt = 0;
    public static int procCnt = 0;

    public static void main(String[] args) {
//        int[] arr = {10, 2, 6, 4, 3, 7, 5};   // 7 - 17
//        int[] arr = {1, 1, 2, 2, 3, 3, 5, 5, 7, 7, 9, 9};   //12 - 11
        int[] arr = {10,9,8,7,6,5,4,3,2,1};  //10 - 54

        for (int i = 1; i < arr.length; i++) {
            int standard = arr[i];  // 기준
            int aux = i - 1;   // 비교할 대상

            while (check(arr, aux, standard)) {
                arr[aux + 1] = arr[aux];   // 비교대상이 큰 경우 오른쪽으로 밀어냄
                aux--;
                moveCnt++;
            }

            arr[aux + 1] = standard;  // 기준값 저장
        }

        printArr(arr);
    }

    private static boolean check(int[] arr, int aux, int standard) {
        procCnt++;
        return (aux >= 0 && standard < arr[aux]);
    }


    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nn : " + arr.length);
        System.out.println("moveCnt : " + moveCnt);
        System.out.println("procCnt : " + procCnt);
    }
}
