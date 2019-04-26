package com.sunny.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class CountingSort2 {

    public static void main(String[] args) throws IOException {
        long startTotal = System.currentTimeMillis();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> arr = new ArrayList<>();

        List<StringBuilder> result = new ArrayList<>(100);
        for(int i=0;i<100;i++) {
            result.add(new StringBuilder());
        }

        //0 : 720 ms
        int inputCnt = 0;
        do {
            String input = bufferedReader.readLine();
            String[] strs = input.split(" ");

            int sourceIndex = Integer.valueOf(strs[0]);
            String sourceString = strs[1];

            if(inputCnt <= (n / 2 -1)) {
                result.get(sourceIndex).append("-").append(" ");
            } else {
                result.get(sourceIndex).append(sourceString).append(" ");
            }

            inputCnt++;
        } while(inputCnt<n);

        result.forEach(System.out::print);

        bufferedReader.close();

        System.out.println("\n\nIt tooks " + (System.currentTimeMillis() - startTotal)  + " ms");
    }
}
