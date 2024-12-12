package org.rburgos;

import java.util.ArrayList;
import java.util.List;

public class TestingConcurrenceInList {

    private static final List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        for(int i=0; i<1000000; i++){
            int index = i;
            new Thread(() -> list.add(index)).start();
        }
    }


}
