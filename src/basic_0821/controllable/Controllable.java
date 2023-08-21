package basic_0821.controllable;

/**
 * @implSpec  : 전자제품을 제어하기 위한 메서드를 가진 인터페이스
 */

public interface Controllable {
    /**
     * @param : x
     * @return : void
     * @throws : x
     * @implSpec : 필요한 경우 오버라이드 해서 사용하기
     */
    default void repair() {
        System.out.println("수리한다.");
        show("장비를 수리한다.");
    }

    static void reset() {
//        # static이 아니기 때문에 쓸 수 없음
//        show();
        System.out.println("장비를 초기화한다.");
    }

    private void show(String s) {
        System.out.println(s);
    }

    // 추상 메서드 : 상속받으면 무조건 구현해야함
    void turnOn();

    // 추상 메서드 : 상속받으면 무조건 구현해야함
    void turnOff();
}
