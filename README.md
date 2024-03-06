Java Collection
  - 자바에서 자료구조를 구현한 클래스

Collection
  - List
    - LinkedList : 목록 끝에 원소를 변경할떄 쉬베 제거 할 수 있는 메소드를 제공하는 List
    - ArrayList : 속도가 빠르고 크기가 고정값이 아니며, 사용자가 원하는만큼 크기를 조절할 수 있다.
    - Vector : ArrayList의 예전버전
    - Stack
  - Set
    - HashSet : Object가 순서 상관 없이 저장되고 중복이 되지 않는다.
    - SortedSet(TreeSet) : 정렬 방법을 설정할 수 있다.
    
Map
  - HasMap : Key, Value 쌍으로 구성되며 null값이 가능하다.
  - HashTable : 기본적인 구성은 HashMap과 비슷하지만, Null이 불가능하며, HashMap과 다르게 스레드와 연관이 있어 병렬처리를 하며 자원의 동기화가 필요한 경우 사용한다.
  - SortedMap(TreeMap) : 정렬된 순서대로 Key, Value를 저장하고 검색이 빠르다.
