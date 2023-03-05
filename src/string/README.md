# String

* String & StringBuilder
  * String -> 불변
  * 만약 String 값을 변화하고자 하면, 항상 새로운 객체가 생성됨.
  * 따라서 StringBuilder 를 활용하고, 이후 .toString() 메서드를 통해 String 으로 변환
```java
String answer = "";
answer += "abc";

StringBuilder answer = new StringBuilder();
answer.append("abc");
String str = answer.toString();
```

* String -> 배열
  * .toCharArray() 메서드를 활용해서 char[] 배열 생성

* UpperCase & LowerCase
  * Character 클래스의 toUpperCase or toLowerCase 사용 가능
  * Character 클래스의 isUpperCase or isLowerCase 사용 가능
  * String 객체의 toUpperCase or toLowerCase 사용 가능
```java
char upper = Character.toUpperCase('c');
boolean result = Character.isUpperCase('C');

String word = "aVeCSsE";
word = word.toUpperCase()
```

* String 길이
  * .length()

* 기타
  * charAt(), indexOf() ...