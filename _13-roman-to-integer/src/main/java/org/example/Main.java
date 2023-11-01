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

    private static int algToInt(String first, String second){
        int value = 0;

        if(first.equals("I") && second.equals("V")){
            value = 4;
        }
        return value;
    }
}