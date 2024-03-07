package collectionStudy.collection.list.linkedList;

import collectionStudy.collection.list.arrayList.ArrayListStructure;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListStructure {
    public static void main(String[] args) {
        // 노드를 사용하면 검색이 빠르다.

        /**
         * 생성
         */
        LinkedList<Integer> linkedList = new LinkedList<>();

        /**
         * 데이터 추가
         */
        //2-1. 데이터 추가
        for (int i = 1; i <= 10; i++) {
            linkedList.add(i);
        }
        // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println("linkedList = " + linkedList);
        /////////////////////////////////////////////////////////////////////////////////
        //2-2. 원하는 위치에 데이터 추가
        linkedList.add(5, 55);
        // [1, 2, 3, 4, 5, 55, 6, 7, 8, 9, 10]
        System.out.println("linkedList = " + linkedList);
        /////////////////////////////////////////////////////////////////////////////////
        //2-3. 새로운 Collection 맨 뒤에 추가
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(11);
        arr.add(22);
        arr.add(33);
        linkedList.addAll(arr);
        // [1, 2, 3, 4, 5, 55, 6, 7, 8, 9, 10, 11, 22, 33]
        System.out.println("linkedList = " + linkedList);
        /////////////////////////////////////////////////////////////////////////////////
        /**
         * 수정(index, element)
         */
        linkedList.set(0, 0);
        // linkedList = [0, 2, 3, 4, 5, 55, 6, 7, 8, 9, 10, 11, 22, 33] -> 0번째가 1에서 0으로 변경한다.
        System.out.println("linkedList = " + linkedList);
        /////////////////////////////////////////////////////////////////////////////////
        /**
         * 삭제
         */
        // 4-1. 첫번쨰값 제거
        linkedList.remove();
        System.out.println("linkedList = " + linkedList); // linkedList = [2, 3, 4, 5, 55, 6, 7, 8, 9, 10, 11, 22, 33]
        // 4-1. 10번쨰값 제거
        linkedList.remove(10);
        System.out.println("linkedList = " + linkedList); // linkedList = [2, 3, 4, 5, 55, 6, 7, 8, 9, 10, 22, 33]
        // 4-1. 전체 제거
        linkedList.clear();
        System.out.println("linkedList = " + linkedList); // linkedList = []
        /////////////////////////////////////////////////////////////////////////////////

        /*
            결론적으로
            순차적으로 데이터를 추가/삭제하는 경우 -> ArrayList
            중간 데이터를 추가/삭제하는 경우 -> LinkedList

            두개를 혼용해서 사용하는 경우 작업하기 전에 데이터 작성시 ArrayList를 사용하고
            작업할때는 LinkedList로 변경해서 작업하면 빠른 효율이 나온다.
         */
        ArrayList<Integer> reArrList = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            reArrList.add(i);
        }
        System.out.println("reArrList = " + reArrList);

        LinkedList reLinkList = new LinkedList(reArrList);

        System.out.println("reLinkList = " + reLinkList);

    }
}
