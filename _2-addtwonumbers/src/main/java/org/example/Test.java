package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {

    public static ArrayList<Integer> integerArrayList(ArrayList<Integer> list1, ArrayList<Integer> list2){
        Collections.reverse(list1);
        Collections.reverse(list2);

        Integer value1 = list1.stream()
                .mapToInt(Integer::intValue)
                .reduce(0, (subtotal, elemento) -> subtotal * 10 + elemento);

        Integer value2 = list2.stream()
                .mapToInt(Integer::intValue)
                .reduce(0, (subtotal, elemento) -> subtotal * 10 + elemento);

        Integer sum = value1 + value2;

        ArrayList<Integer> lista = IntStream.iterate(sum, n -> n > 0, n -> n / 10)
                .map(n -> n % 10)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        return lista;

    }

}
