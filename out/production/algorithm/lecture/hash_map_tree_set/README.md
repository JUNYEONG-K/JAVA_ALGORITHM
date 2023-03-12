# HashMap, TreeSet

* HashMap
  * <Key, Value> 배열 자료구조
  * Key 와 Value 의 Generic Type -> Wrapper Class
```java
HashMap<Character, Integer> map = new HashMap<>();
// 아래 방식을 통해 counting 가능
map.put('A', map.getOrDefault('A', 0) + 1);
// 아래 방식을 통해 Key 값들을 배열로 받을 수 있음.
map.keySet()
```

* TreeSet
  * Set -> 중복을 없애주는 자료구조
  * TreeSet -> 이진트리로 이루어져서, 정렬까지 됨.
```java
// TreeSet -> 기본 오름차순 집합 자료구조 -> reverseOrder 를 통해 내림차순
TreeSet<Integer> cardSet = new TreeSet<>(Collections.reverseOrder());
```