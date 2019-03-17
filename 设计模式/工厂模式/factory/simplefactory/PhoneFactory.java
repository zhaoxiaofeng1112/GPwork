package factory.simplefactory;

import factory.HuaweiPhone;
import factory.IPhone;
import factory.SamsumPhone;

public class PhoneFactory {
    public static IPhone create(String type) {
        if (type.equals("huawei")) {
            return new HuaweiPhone();
        } else if (type.equals("samsum")) {
            return new SamsumPhone();
        }

        return null;
    }
}
