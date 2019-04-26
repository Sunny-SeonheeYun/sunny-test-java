package com.sunny.test.performance.bigo;

public class Quadratic {
    public int execute(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
//                System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
                cnt++;
            }
        }
        return cnt;
    }
}
