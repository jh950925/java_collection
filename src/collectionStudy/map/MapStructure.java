package collectionStudy.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapStructure {
    public static void main(String[] args) {
        /**
         * 1. HashMap
         * HashMap<Object, Object>
         * null 허용,  순서가 보장 X
         */
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("data1", 1);
        hashMap.put("data2", 2);
        hashMap.put("data3", 3);
        hashMap.put("data4", null);
        hashMap.put("data5", null);
        System.out.println("hashMap = " + hashMap);

        /**
         * 2. LinkedHashMap
         *  LinkedHashMap<Object, Object>
         *  null 허용,  순서가 보장 O
         */
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("data1", 1);
        linkedHashMap.put("data2", 2);
        linkedHashMap.put("data3", 3);
        linkedHashMap.put("data4", null);
        linkedHashMap.put("data5", null);
        System.out.println("linkedHashMap = " + linkedHashMap);

        /**
         * 3. conCurrentHashMap
         * conCurrentHashMap<Object, Object>
         * null 허용 X, 자동정렬 X, 데이터 동기화, Multi Thread 가능
         */
        Map<String, Integer> conCurrentHashMap = new ConcurrentHashMap<>();
        conCurrentHashMap.put("data1", 1);
        conCurrentHashMap.put("data4", 4);
        conCurrentHashMap.put("data2", 2);
        conCurrentHashMap.put("data3", 3);
        conCurrentHashMap.put("data5", 5);
        conCurrentHashMap.put("data6", 6);
        conCurrentHashMap.put("data7", 7);
        System.out.println("conCurrentHashMap = " + conCurrentHashMap);


    }
}
