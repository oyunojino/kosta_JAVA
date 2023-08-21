package basic_0821.person;

public class PersonCompareTest {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("홍길동",32, 170, 75),
                new Person("박지성",40, 175, 68),
                new Person("손흥민",20, 180, 70),
        };

//        Q: 나이를 기준으로 나이가 가장 많은 사람부터 이름을 출력하시오.
//          -> 두가지 방법을 이용
//          1. compareTo의 리턴값 변형
//          2. Arrays.sort 후 순서를 뒤집는 메서드 활용

    }
}

class Person implements Comparable<Person>{
    String name;
    int age;
    int height;
    int weight;

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person person) {
        
        return 0;
    }

//    메서드
}