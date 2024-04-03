package org.example;

import java.util.ArrayList;

import static org.example.Test.integerArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(4);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(6);
        list2.add(4);

        ArrayList<Integer> result = integerArrayList(list1, list2);
        System.out.println("Resultado: " + result);
  }
}