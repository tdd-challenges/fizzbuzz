package io.tdd.kata;

public class FizzBuzz{
    public String printFizzBuzz(int upper){
        String result = "";
        int i = 1;
        String tmp = "";

        do{
            tmp = Integer.toString(i);
            if ( i % 3 == 0){
                tmp = "Fizz";
            }

            if (i % 5 == 0){
                tmp = "Buzz";
            }

            if ( i % 3 == 0 && i % 5 == 0){
                tmp = "FizzBuzz";
            }
            if ( i == 1){
                result = "1";
            }else{
                result = result + ", " + tmp;
            }
            i++;
        }while( i < upper);

        return result;
    }
}