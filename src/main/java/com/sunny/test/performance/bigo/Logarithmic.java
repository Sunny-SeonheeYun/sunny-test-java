package com.sunny.test.performance.bigo;

import java.util.stream.IntStream;

public class Logarithmic {
    public int execute(int n) {
//        return IntStream.range(0, input).filter(x -> (x % 2) == 0).map(x -> 1).sum();

        int cnt = 0;

//        for (int i = 1; i < n; i = i * 2){
////            System.out.println("Hey - I'm busy looking at: " + i);
//            cnt++;
//        }

        for (int i = 1; i <= n; i++){
            for(int j = 1; j < 8; j = j * 2) {
//                System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
                cnt++;
            }
        }
        return cnt;
    }
}
