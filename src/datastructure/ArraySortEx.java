package datastructure;

import java.util.Arrays;

public class ArraySortEx {
    public static void main(String[] args) {
        Integer[] array = {6, 5, 1, 2, 8, 9};
        Arrays.sort(array,(o1, o2) -> o2 - o1);

        for (int x : array) {
            System.out.println(x);
        }

    }
}
