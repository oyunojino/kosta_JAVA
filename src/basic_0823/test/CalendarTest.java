package basic_0823.test;

import java.util.Calendar;

public class CalendarTest {
  public static void main(String[] args) {
    String[] weekName = {"일", "월", "화", "수", "목", "금", "토"};
    String[] noonName = {"오전", "오후"};
    Calendar c = Calendar.getInstance();

    // 코드 추가
    int year = c.get(c.YEAR);
    int month = c.get(c.MONTH) + 1;
    int day = c.get(c.DATE);
    System.out.println(year + "년 " + month + "월 " + day + "일");


    String week = weekName[c.get(c.DAY_OF_WEEK) - 1];
//    switch (c.get(c.DAY_OF_WEEK)) {
//      case 1 -> week ="일";
//      case 2 -> week ="월";
//      case 3 -> week ="화";
//      case 4 -> week ="수";
//      case 5 -> week ="목";
//      case 6 -> week ="금";
//      case 7 -> week ="토";
//    }
    String noon = noonName[c.get(c.AM_PM)];
    System.out.println(week + "요일 " + noon);


    int hour = c.get(c.HOUR);
    int minute = c.get(c.MINUTE);
    int second = c.get(c.SECOND);
    System.out.println(hour + "시 " + minute + "분 " + second + "초");
  }
}
