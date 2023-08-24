package basic_0824.test;

import java.util.ArrayList;

public class AnimalDemo {
  public static void main(String[] args) {
    ArrayList<String> anis = new ArrayList<>();
    anis.add("갈매기");
    anis.add("나비");
    anis.add("다람쥐");
    anis.add("라마");

    for(String ani : anis) {
      if(ani.length() == 2){
        System.out.println(ani);
      }
    }
  }
}
