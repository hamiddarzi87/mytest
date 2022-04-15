package com.hb.test;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("I am in branch_a");
        List<Integer> integers = List.of(1, 2, 3, 4);
        for (Integer i : integers) {
            System.out.println("Integer value: " + i);
        }
    }
}
