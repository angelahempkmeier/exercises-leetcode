package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(252));
    }

    public static Boolean isPalindrome(int x){
        Integer xStart = x;
        Integer xEnd = xStart.toString().length();
        char[] digitos = String.valueOf(x).toCharArray();
        char[] opposite = new char[xEnd];
        for(int i = 1; i <= xEnd; i++){
            opposite[i-1] = digitos[xEnd - i];
        }

        if(Arrays.equals(digitos, opposite)){
            return true;
        }
        return false;
    }
}