package com.sunny.test;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TestMain {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Map<String, Integer> map = new HashMap<String, Integer>(n);
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();

            map.put(name,phone);
        }
        while (in.hasNext()) {
            String s = in.next();
            Integer phone = map.get(s);

            if(phone != null) {
                System.out.println(s + "=" + phone);
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
