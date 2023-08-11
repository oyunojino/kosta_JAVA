package basic_test_0811;

public class Ex_02_uml_test_Car {
  int speed = 0;
  boolean direction = false;

  String direction_1 = "";

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public void setDirection(boolean direction) {
    this.direction = direction;
  }

  public void setDirection_1(String gear) {
    if (gear.equals("전진")) {
      this.direction = true;
    } else if (gear.equals("후진")) {
      this.direction = false;
    }
  }
}
