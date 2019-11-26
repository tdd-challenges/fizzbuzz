package io.tdd.kata;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Number number = new Number(100);
        List<String> arr = number.generateArray();
        for( int j = 0; j < 100; j ++){
            System.out.print(j == 99 ? arr.get(j) : arr.get(j) + ',');
        }
    }
}
