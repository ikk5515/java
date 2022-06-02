public class ThreadB extends Thread {
    public ThreadB() {
        setName("ThreadB");
    }

    @Override
    public void run() {
        for (int i=0; i<5; i++) {
            System.out.print(getName() + " 작동 중");
        }
    }
}