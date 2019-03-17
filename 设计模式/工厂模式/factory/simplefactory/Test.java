package factory.simplefactory;

import factory.IPhone;

public class Test {
    public static void main(String[] args) {
        IPhone phone=PhoneFactory.create("huawei");
        phone.ring();

        IPhone phone2=PhoneFactory.create("samsum");
        phone2.ring();
    }
}
