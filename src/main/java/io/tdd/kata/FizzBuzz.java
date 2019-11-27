package io.tdd.kata;

public class FizzBuzz {

    public String printFizzBuzz(int size){
        String str = "";

        for (int i=1;i<=size;i++){
            if((i)%15==0){
                str+="FizzBuzz, ";
            }else if((i)%5==0){
                str+="Buzz, ";
            }else if((i)%3==0){
                str+="Fizz, ";
            }else{
                str = str+i+", ";
            }
        }

        return str.substring(0, str.length()-2);
    }
}