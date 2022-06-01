package week13;

public class ClassC implements InterfaceA, InterFaceB{
    @Override
    public void methodB() {
        System.out.println("methodB");
    }

    @Override
    public void methodA() {
        System.out.println("methodA");
    }
}
