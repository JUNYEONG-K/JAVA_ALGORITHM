# Two pointers, Sliding window

* Two pointers
  * 배열 탐색 시 2중, 3중 for 문을 돌아야 할 경우 -> O(n) 시간 복잡도를 갖도록 하는 방식
  * lt, rt 변수를 통해 배열을 O(n) 시간복잡도로 순회

* Sliding window
  * Two pointers 의 방식을 활용하며, lt 와 rt 사이의 범위를 활용하고, lt 와 rt 를 각각 좌측으로 옮겨가며 순회
  * lt 와 rt 사이의 범위 => window
  * lt 와 rt 를 각각 움직여가며 Sliding
    * 이 때, rt 에 해당하는 값은 더해주고, lt 에 해당하는 값은 빼주는 연산을 하는 것이 중요!