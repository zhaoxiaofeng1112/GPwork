package factory;

public class HuaweiPhone implements IPhone {
    @Override
    public void ring() {
        System.out.println("华为手机");
    }
}
