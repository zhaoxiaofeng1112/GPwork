package factory.factorymethod;

import factory.IPhone;

public class Test {
    public static void main(String[] args) {
        IPhoneFactory factory=new HuaweiPhoneFactory();
        IPhone phone=factory.create();
        phone.ring();

        IPhoneFactory factory2=new SamsumPhoneFactory();
        IPhone phone2=factory2.create();
        phone2.ring();
    }
}
