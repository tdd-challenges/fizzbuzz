package io.tdd.kata;

public class FizzBuzz {

	private static String printAt(int index) {
		if (index % 15 == 0) {
			return "FizzBuzz";
		} else if (index % 5 == 0) {
			return "Buzz";
		} else if (index % 3 == 0) {
			return "Fizz";
		} else {
			return index + "";
		}
	}

	public static String printTo(int range) {
		String result = "";

		for (int i = 1; i <= range; i++) {
			if (i == 1) {
				result += printAt(1);
			} else {
				result += ", " + printAt(i);
			}
		}

		return result;
	}
}
