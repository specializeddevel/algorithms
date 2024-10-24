package org.rburgos;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {

    List<Integer> copiedArray = new ArrayList<>();
    Integer originalarrayLenght;

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort(List.of(6,4,5,3,1,2,8));
        List<Integer> ordenadoSelection = selectionSort.sortArray();
        System.out.println(ordenadoSelection);
    }

    public SelectionSort(List<Integer> originalArray) {
        this.copiedArray.addAll(originalArray);
        originalarrayLenght = originalArray.size();
    }

    public List<Integer> sortArray() {
        List<Integer> newArray = new ArrayList<>();
        for(int i = 0; i < this.originalarrayLenght; i++) {
            int positionSmall = findSmallPosition(this.copiedArray);
            newArray.add((Integer) this.copiedArray.get(positionSmall));
            this.copiedArray.remove(positionSmall);
            System.out.println(this.copiedArray);
            System.out.println(newArray);
            System.out.println("****************************************");
        }
        return newArray;
    }

    private Integer findSmallPosition(List<Integer> array) {
        int min = array.get(0);
        int position = 0;
        for(int i = 0; i < array.size(); i++) {
            if (array.get(i) < min) {
                min = array.get(i);
                position = i;
            }
        }
        return position;
    }


}

