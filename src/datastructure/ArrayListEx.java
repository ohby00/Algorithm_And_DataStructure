package datastructure;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {
    static void print(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(6);
        list1.add(4);
        list1.add(2);
        list1.add(3);
        list1.add(9);
        list1.add(1);

        ArrayList<Integer> list2 = new ArrayList<>(list1.subList(0, 3));
                                                // list1.subList(0, 3) -> 0,1,2 가져오기
        print(list1, list2);

        Collections.sort(list1);
        Collections.sort(list2);
        // Collections.sort(list) -> 정렬

        System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
        // list1.containsAll(list2)) -> 포함여부 (true, false)

        list1.set(2, 0);
        // list1.set -> 교체
        list2.add(2, 3);
        list2.add(2, 4);
        print(list1,list2);

        System.out.println("list1.retainAll(list2) :" + list1.retainAll(list2));
        // list1에서 list2와 겹치는 부분만 남기고 다 삭제
        print(list1, list2);

        // list2에서 list1에 포함된 객체들을 삭제함
        for (int i = list2.size() - 1; i >= 0; i--) {
            if(list1.contains(list2.get(i)))
                list2.remove(i);
        }
        print(list1, list2);
    }
}
