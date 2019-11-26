package io.tdd.kata;

import java.util.List;
//import java.util.Arrays;
import java.util.ArrayList;

public class FizzBuzzArray{

    public String print(int upper){

        //List<String> Names = Arrays.asList(new String[]{});
        List<String> Names = new ArrayList<String>();

        int i = 0;

        do{
            i++;

            if ( i % 3 == 0 && i % 5 == 0){
                Names.add("FizzBuzz");
                continue;
            }

            if ( i % 3 == 0){
                Names.add("Fizz");
                continue;
            }

            if (i % 5 == 0){
                Names.add("Buzz");
                continue;
            }

            Names.add(Integer.toString(i));

        }while( i < upper);
        
        return (String.join(", ", Names));
    }
}