package io.tdd.kata;

public class FizzBuzz {

    public String calculation(int i){
        if(i%3 == 0 && i%5 ==0){
            return "FizzBuzz";
        }

        if(i%3 ==0){
            return "Fizz";
        }

        if(i%5 ==0){
            return "Buzz";
        }

        String result =  Integer.toString(i);
//        String abc = i +"";
        return result;
    }
}
