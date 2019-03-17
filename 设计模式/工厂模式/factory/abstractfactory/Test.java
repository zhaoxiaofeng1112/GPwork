package factory.abstractfactory;

import factory.IComputer;
import factory.IPhone;

public class Test {
    public static void main(String[] args) {
        IProductFactory productFactory=new HuaweiProductFactory();
        IPhone phone=productFactory.createPhone();
        IComputer computer=productFactory.createComputer();
        phone.ring();
        computer.doTask();

        IProductFactory productFactory2=new SansumProductFactory();
        IPhone phone1=productFactory2.createPhone();
        IComputer computer1=productFactory2.createComputer();
        phone1.ring();
        computer1.doTask();
    }
}
