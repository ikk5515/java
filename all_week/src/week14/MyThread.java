public class MyThread extends Thread{
    private int x;

    public MyThread(int x) {
        this.x = x;
        // 메인 메소드는 메인 스레로서 다른 스레드를 불러낸 후에 바로 종료되기 때문에
        // setDaemon(true)로 설정된 스레드바메인 스레드가 종료되면 같이 종료된다.
        setDaemon(true);
    }

    @Override
    public void run() {
        for (int i=0; i<5; i++){
            System.out.println(x + "번째 스레드입니다.");
        }
        
    }
}
