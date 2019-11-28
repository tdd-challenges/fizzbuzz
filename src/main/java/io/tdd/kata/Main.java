package io.tdd.kata;

public class Main {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.printNCharALine(fizzBuzz.fizzBuzz(100),14));
    }
}
