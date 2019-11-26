package io.tdd.kata;

import java.util.ArrayList;
import java.util.List;

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

    public List<String>  generateArray(){
        for(int i = 0; i < this.length; i ++){
            String value = this.arr.get(i);
            if((Integer.parseInt(value) % 3 == 0) && (Integer.parseInt(value) % 5 == 0)){
                this.arr.set(i, "FizzBuzz");
            }else if(Integer.parseInt(value) % 5 == 0 && Integer.parseInt(value) % 3 != 0){
                this.arr.set(i, "Buzz");
            }else if(Integer.parseInt(value) % 3 == 0 && Integer.parseInt(value)% 5 != 0){
                this.arr.set(i, "Fizz");
            }
        }
        return this.arr;
    }
}