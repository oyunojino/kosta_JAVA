package basic_0811;

public class Ex_05_usePhone {
  public static void main(String[] args) {
    Ex_04_Phone phone1 = new Ex_04_Phone("갤럭시S23", 1_000_000);
    Ex_04_Phone myPhone = phone1;
    System.out.println(Ex_04_Phone.getNumOfPhones() + "대가 생성되었습니다.");
    myPhone.print();
//    System.out.println(phone1.get);

    Ex_04_Phone yourPhone = new Ex_04_Phone("아이폰i15", 1_200_000);
    System.out.println(Ex_04_Phone.getNumOfPhones() + "대가 생성되었습니다.");
    yourPhone.print();
  }
}
