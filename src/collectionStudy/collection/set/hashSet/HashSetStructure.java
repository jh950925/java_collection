package collectionStudy.collection.set.hashSet;

import java.util.HashSet;

public class HashSetStructure {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(1);
        hashSet.add(2);
        System.out.println("hashSet = " + hashSet);

        // HashSet의 가장 큰 장점인 중복에 제거된다.
        hashSet.add(1);
        System.out.println("hashSet = " + hashSet);
    }
}
