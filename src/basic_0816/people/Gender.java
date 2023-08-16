package basic_0816.people;

public enum Gender {
  MALE("남성"), FEMALE("여성");

  private String gender;

  Gender() {
  }

  private Gender(String gender) {
    this.gender = gender;
  }

  public String getGender() {
    return gender;
  }
}
