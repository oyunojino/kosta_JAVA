package basic_0823;

public class EnterDemo {
  public static void main(String[] args) {
//    <> 사이에는 객체만 가능하기 때문에 int -> Integer로 작성
    Enter<String, Integer> enter = new Enter<>();
    enter.setKey("123");
    enter.setValue(20);
    System.out.println(enter.getKey());
    System.out.println(enter.getValue() * 10);

    Enter<Integer, String> enter1 = new Enter<>();
    enter1.setKey(10);
    enter1.setValue("123");
    System.out.println(enter1.getKey() / 10);
//    if ( ) {
//      System.out.println(Integer.parseInt(enter1.getValue()));
//    }
  }
}

class Enter<K, V> {
  private K key;
  private V value;

  public K getKey() {
    return key;
  }

  public void setKey(K key) {
    this.key = key;
  }

  public V getValue() {
    return value;
  }

  public void setValue(V value) {
    this.value = value;
  }
}