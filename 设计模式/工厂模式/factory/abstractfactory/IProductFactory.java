package factory.abstractfactory;

import factory.IComputer;
import factory.IPhone;

public interface IProductFactory {
    IPhone createPhone();

    IComputer createComputer();
}
