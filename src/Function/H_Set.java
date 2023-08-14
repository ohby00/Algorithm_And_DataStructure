package Function;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class H_Set {
    public static void main(String[] args) {
        // 타입을 지정 가능
        HashSet<String> animals1 = new HashSet<String>();

        // 타입을 생략하여 사용 가능 -> 빈 HashSet생성 시 사용
        HashSet<String> animals2 = new HashSet<>();

        // 초기 용량(Capacity) 설정
        HashSet<String> animals3 = new HashSet<>(10);

        // animal의 모든 값을 가진 HashSet 생성
        //HashSet<String> animals4 = new HashSet<>(animals1);

        //초기값 지정 가능
        //HashSet<String> animals5 = new HashSet<>(Arrays.asList("tiger","banana","fox"));

        HashSet<String> animals = new HashSet<>();
        animals.add("tiger");
        animals.add("lion");
        animals.add("fox");

        HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(1, 2, 3));
        System.out.println(set.size());   //set 크기 : 3
        set.remove(2);  //값 1 제거
        set.clear();       //모든 값을 제거
        //만약 삭제하려는 값이
        //HashSet 내부에 존재한다면 그 값을 삭제하고 true를 반환한다.
        //HashSet 내부에 존재하지 않는 다면, false를 반환한다.
        System.out.println(set);  //출력결과 :  [1,2,3]
        Iterator iter = set.iterator();

        while (iter.hasNext()) {  //hasNext() : 가져올 객체가 있다면 true 리턴, 없다면 false 리턴
            System.out.println(iter.next());  // next() : Iterator에서 하나의 객체를 가져올 수 있는 메소드
        }
    }
}

