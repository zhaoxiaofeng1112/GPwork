package factory.factorymethod;

import factory.HuaweiPhone;
import factory.IPhone;

public class HuaweiPhoneFactory implements  IPhoneFactory {
    @Override
    public IPhone create() {
        return new HuaweiPhone();
    }
}
