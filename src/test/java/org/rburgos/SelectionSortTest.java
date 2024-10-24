package org.rburgos;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @ParameterizedTest(name = "Test {index} con {0} - {1}")
    @MethodSource("arrayProvider")
    void sortArray(List<Integer> inputArray, List<Integer> expectedOutputArray) {
        SelectionSort selectionSort = new SelectionSort(inputArray);
        List<Integer> actualArray = selectionSort.sortArray();
        assertArrayEquals(expectedOutputArray.toArray(), actualArray.toArray());
        assertArrayEquals(inputArray.stream().sorted().toArray(), actualArray.toArray());
    }

    static Object[][] arrayProvider() {
        return new Object[][]{
                {List.of (6,5,4,1, 2, 3), List.of (1, 2, 3, 4,5,6)},
                {List.of (1, 2, 3), List.of (1, 2, 3)},
                {List.of (0, 0, 0), List.of (0, 0, 0)},
                {List.of (-10, 0, -15), List.of (-15, -10, 0)},
                {List.of (-0, -0, -1), List.of (-1, 0, 0)}
        };
    }
}
