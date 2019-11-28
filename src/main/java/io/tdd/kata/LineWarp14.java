package io.tdd.kata;

public class LineWarp14 {
    public static String warp() {
        String Line = FizzBuzz.printNum(100);
        int length = FizzBuzz.printNum(100).length();
        double row = Math.ceil(length / 14);
        String WarpedString = "";
        for (int i = 1; i <= row; i++) {
            WarpedString = WarpedString + Line.substring((14 * (i - 1)), (14 * i));
            WarpedString = WarpedString + "\n";
        }
        WarpedString = WarpedString + "z, 100";
        return WarpedString;
    }

}
