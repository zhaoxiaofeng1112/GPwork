package factory.factorymethod;

import factory.IPhone;
import factory.SamsumPhone;

public class SamsumPhoneFactory implements  IPhoneFactory {
    @Override
    public IPhone create() {
        return new SamsumPhone();
    }
}
