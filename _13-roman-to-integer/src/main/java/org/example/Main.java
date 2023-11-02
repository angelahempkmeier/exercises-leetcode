package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }

    public static int romanToInt(String s) {
        char[] romanNumber = s.toCharArray();
        int value = 0;
        for(int i = 0; i < romanNumber.length; i++){
            if(i+1<romanNumber.length){
                String first = String.valueOf(romanNumber[i]);
                String second = String.valueOf(romanNumber[i+1]);
                value = algToInt(first, second);
            }
        }
        return value;
    }

    private static int returnIntValue(String romanValue){
        int i;
        switch (romanValue){
            case "I": return 1;
            case "V": return 5;
            case "X": return 10;
            case "L": return 50;
            case "C": return 100;
            case "D": return 500;
            case "M": return 1000;
            default:
                i = 0;
        }
        return i;
    }

    private static int algToInt(String first, String second){
        int value = 0;

        if(first.equals("I") && second.equals("V")){
            value = 4;
        }else if(first.equals("I") && second.equals("X")){
            value = 9;
        } else if (first.equals("X") && second.equals("L")) {
            value = 40;
        } else if (first.equals("X") && second.equals("C")) {
            value = 90;
        }
        return value;
    }
}