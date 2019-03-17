package factory.abstractfactory;

import factory.HuaweiComputer;
import factory.HuaweiPhone;
import factory.IComputer;
import factory.IPhone;

public class HuaweiProductFactory implements IProductFactory {
    @Override
    public IPhone createPhone() {
        return new HuaweiPhone();
    }

    @Override
    public IComputer createComputer() {
        return new HuaweiComputer();
    }
}
