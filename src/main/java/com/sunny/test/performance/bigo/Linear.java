package com.sunny.test.performance.bigo;

import java.util.stream.IntStream;

public class Linear {
    public int execute(int n) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
//            System.out.println("Hey - I'm busy looking at: " + i);
            cnt++;
        }
        return cnt;
    }
}
