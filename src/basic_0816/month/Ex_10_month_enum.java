package basic_0816.month;

public class Ex_10_month_enum {
  public static void main(String[] args) {
    Month month = Month.APR;
    System.out.println(month.name());
    System.out.println(month.ordinal());
    System.out.println(month.getMonth());
  }
}
