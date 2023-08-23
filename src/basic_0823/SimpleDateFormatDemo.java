package basic_0823;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
  public static void main(String[] args) {
    Date date = new Date();
    System.out.println(date);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//    dd => 일
//    DD => 365일 중 남은 일 수

    System.out.println(sdf.format(date));
  }
}
