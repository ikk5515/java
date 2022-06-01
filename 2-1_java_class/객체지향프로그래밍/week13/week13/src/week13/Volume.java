package week13;

// 인터페이스 선언
public interface Volume {

    //인터페이스는 객체 사용 설명서이므로 런타임 시 데이터를 저장할 수 있는 필드를 선언할 수 없다.
    // 인터페이스에서 선언 가능한 것은 상수(static final) 필드이다.
    // 상수를 선언할 때는 반드시 초기값을 설정해야 한다.
    // static final을 생략해도 컴파일 과정에서 자동 생성된다.
    public int MAX_VOLUME = 20;
    public int MIN_VOLUME = 0;


    // 인터페이스에 선언된 메소드는 실행문이 없는 추상메소드 이다.
    // public abstract를 생략해도 컴파일 과정에서 자동으로 생성된다.
    // 최종적으로 구현 클래스에서 정의되고 객체에서 실행된다.
    public void VolumeUp(int level);
    public void VolumeDown(int level);

    // 디폴트 메소드 선언 => 기존 구현 클래스에는 영향을 주지 않는다.
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리합니다.");
        } else {
            System.out.println("무음 해제합니다.");
        }

    }
}