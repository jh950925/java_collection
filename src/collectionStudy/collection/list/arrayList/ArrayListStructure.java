package collectionStudy.collection.list.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListStructure {
    public static void main(String[] args) {
        
        /**
         * 생성
         */
        ArrayList<Integer> IntegerList = new ArrayList<Integer>();
        System.out.println("IntegerList = " + IntegerList);

        /**
         * 추가 
         */
        IntegerList.add(0);
        System.out.println(IntegerList);
        for (int i = 1; i < 10; i++) {
            IntegerList.add(i);
        }
        System.out.println("최종 추가 : " +  IntegerList);

        /**
         * 가져오기 
         */

        for (Integer i : IntegerList) {
            System.out.println(i);
        }
        System.out.println(IntegerList.get(5));
        System.out.println("IntegerList 크기  = " + IntegerList.size());

        /**
         * 삭제
         */
        System.out.println("IntegerList = " + IntegerList);
        System.out.println("삭제전 IntegerList.get(0) : " + IntegerList.get(0));
        IntegerList.remove(0);
        System.out.println("삭제후 IntegerList.get(0) : " + IntegerList.get(0));
//        IntegerList.remove(9);
        // Error -> 위에서 0번쨰 요소를 삭제하여서 0번째 요소는 한칸씩 당겨서 1이 되었고
        // size()는 9 -> 8 되었기 떄문에 remove(9)는 에러가 나온다.

        System.out.println(IntegerList);

        /**
         * 요소 확인
         * 1. contains
         * 2. indexOf
         * 3. lastIndexOf
         */
        System.out.println(IntegerList);
        //1. contains
        System.out.println(IntegerList.contains(3)); //true
        System.out.println(IntegerList.contains(10)); // false
        //2. indexOf
        System.out.println(IntegerList.indexOf(2)); //1
        System.out.println(IntegerList.indexOf(10)); // -1 존재하지 않음
        IntegerList.add(1);
        System.out.println(IntegerList);
        System.out.println(IntegerList.indexOf(1)); // 0
        System.out.println(IntegerList.lastIndexOf(1)); // 9 -> indexOf는 앞에서부터 lastIndexOf는 뒤에서부터 찾는다.

        /**
         * 정렬
         */
        IntegerList.add(2);
        IntegerList.add(11);
        IntegerList.add(0);

        System.out.println("정렬전 : " + IntegerList); // 정렬전 : [1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 11, 0]
        Collections.sort(IntegerList);
        System.out.println("정렬후 : " + IntegerList); // 정렬후 : [0, 1, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 11]
    }
}
