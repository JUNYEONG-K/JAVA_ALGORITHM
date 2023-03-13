# Stack, Queue

* Stack
  * FILO or LIFO
    * First In Last Out
    * Last In First Out
```java
// 선언
Stack<Integer> stack = new Stack<>();
// push
stack.push(1);
// pop
stack.pop();
// top 값 확인
stack.peek();
// 크기
stack.size();
```

* Queue
  * FIFO or LILO
    * First In First Out
    * Last In Last Out
```java
// 선언 (LinkedList 활용)
Queue<Integer> queue = new LinkedList<>();
// offer
queue.offer(1);
// poll
queue.poll();
// 맨 앞 값 확인
queue.peek();
// 크기
queue.size();
```