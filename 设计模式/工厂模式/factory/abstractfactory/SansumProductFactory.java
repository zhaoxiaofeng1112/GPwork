package factory.abstractfactory;

import factory.IComputer;
import factory.IPhone;
import factory.SamsumComputer;
import factory.SamsumPhone;

public class SansumProductFactory implements  IProductFactory {
    @Override
    public IPhone createPhone() {
        return new SamsumPhone();
    }

    @Override
    public IComputer createComputer() {
        return new SamsumComputer();
    }
}
