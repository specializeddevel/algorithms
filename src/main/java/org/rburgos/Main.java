package org.rburgos;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Arguments review
        Arrays.stream(args).forEach(System.out::println);
        int valor = args.length == 0 ? 0 : Integer.parseInt(args[0]);
        System.out.println(valor);

        //Selection sort invocation
        SelectionSort selectionSort = new SelectionSort(List.of(6,4,5,3,1,2,8));
        List<Integer> ordenadoSelection = selectionSort.sortArray();
        System.out.println(ordenadoSelection);



    }
}