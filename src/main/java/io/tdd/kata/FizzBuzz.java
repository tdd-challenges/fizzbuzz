package io.tdd.kata;

public class FizzBuzz {

    public static String calculate(int num) {
        if (num % 3 == 0 && num % 15 !=0) {
            return "Fizz";
        } else if (num % 5 == 0 && num % 15 !=0) {
            return "Buzz";
        } else if(num % 15 == 0) {
            return "FizzBuzz";
        }else{
            return Integer.toString(num);
        }
    }

    public  static String printNum(int Total) {
        String result = "";

        for (int i = 1; i <= Total; i++) {
            if (i == 1) {
                result = result + calculate(1);
            } else {
                result = result + ", " + calculate(i);
            }
        }

        return result;
    }


}
