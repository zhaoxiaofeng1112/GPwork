package factory;

public class SamsumPhone implements IPhone {
    @Override
    public void ring() {
        System.out.println("三星手机");
    }
}
