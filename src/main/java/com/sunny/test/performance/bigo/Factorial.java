package com.sunny.test.performance.bigo;

public class Factorial {
    int cnt = 0;
    public int execute(int n) {
        for (int i = 1; i <= n; i++){
            factorial(i);
        }

        return cnt;
    }

    private int factorial(int n) {
        cnt++;
        if (n == 0)
            return 1;
        else
            return factorial(n-1) * n;
    }

    public static void main(String[] args) {
        int input = 0;
        System.out.println(new Factorial().factorial(input));
    }
}
