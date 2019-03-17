package factory;

public class HuaweiComputer implements  IComputer {
    @Override
    public void doTask() {
        System.out.println("华为电脑");
    }
}
