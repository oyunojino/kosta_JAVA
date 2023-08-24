package basic_0824.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PersonDemo1 {
  public static void main(String[] args) {
    Set<Person> set = new HashSet<>();
    set.add(new Person("김열공", 20));
    set.add(new Person("최고봉", 56));
    set.add(new Person("우등생", 16));
    set.add(new Person("나자바", 35));

//    iterator를 이용해 원소 출력
    Iterator<Person> iterator = set.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next());
    }
    System.out.println();


//    동일한 객체 추가해보기
    set.add(new Person("나자바", 35));
//    iterator를 이용해 원소 출력
    iterator = set.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + " ");
    }
    System.out.println();

  }

}

class Person {
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

//  hashSet의 비교 방식과 동일
  @Override
  public int hashCode() {
    return name.hashCode() + age;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj != null && obj instanceof Person person) {
      if (this.hashCode() == person.hashCode()) {
        return true;
      }
    }
    return false;
  }

  @Override
  public String toString() {
    return "Person[" + name + " : " + age + "]";
  }
}
