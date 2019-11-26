package io.tdd.kata;

public class Main {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = "";
        for(int i = 1 ; i<=100 ; i++){
            result = result + fizzBuzz.calculation(i) + ", ";
        }
        System.out.println(result.replace("98, Fizz, Buzz, ","98, Fizz, Buzz"));
    }
}
