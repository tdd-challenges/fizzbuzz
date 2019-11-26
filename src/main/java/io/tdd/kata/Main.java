package io.tdd.kata;

public class Main {
    public static void main(String[] args) {
    FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
    for(int i = 1; i <= 100; i++) {
    	System.out.print(fizzBuzzGame.challenge1(i)+",");
    }
    
    }
}

class FizzBuzzGame{
	public FizzBuzzGame() {
		
	}
	public String challenge1(int i) {
		//String[] ns = new String[100];
		String s = "";
		//for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 != 0) {				
				s = "Fizz";
				//ns[i-1] = s;
			}else if(i % 3 != 0 && i % 5 == 0) {
				s = "Buzz";
				//ns[i-1] = s;
			}else if(i % 3 == 0 && i % 5 == 0) {
				s = "FizzBuzz";
				//ns[i-1] = s;
			}else {
				s = String.valueOf(i);
			}
		//}
		return s;
		
	}
}
