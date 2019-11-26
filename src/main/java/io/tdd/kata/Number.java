package io.tdd.kata;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Number {
    private List<String> arr = null;
    private final int length;
    public Number(final int N){
        this.arr = new ArrayList<String>();
        this.length = N;
        for( int i = 0; i < this.length; i ++ ){
            this.arr.add(String.valueOf(i+1));
        }
    }

    public List<String> generateArray(){
        return this.arr.stream().map(initial -> {
            if(Integer.parseInt(initial) % 15 == 0){
                return "FizzBuzz";
            }else if(Integer.parseInt(initial) % 5 == 0){
                return "Buzz";
            }else if(Integer.parseInt(initial) % 3 == 0){
                return "Fizz";
            }else{
                return initial;
            }
        }).collect(Collectors.toList());
    }
}