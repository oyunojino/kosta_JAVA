package basic_0825.test;

import java.util.HashMap;

public class AnimalsExample {
  public static void main(String[] args) {


    HashMap<String, String> anis = new HashMap<>();
    anis.put("호랑이", "tiger");
    anis.put("표범", "leopard");
    anis.put("사자", "lion");

//    anis.forEach((s, s2) -> System.out.println(s + "=" + s2));
    System.out.println("변경 전 : " + anis);

    anis.replaceAll((s, s2) -> s2.toUpperCase());
    System.out.println("변경 후 : " + anis);
  }
}
