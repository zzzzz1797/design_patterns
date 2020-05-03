package abstractfactory;

/**
 * @author z
 * @date 2020-05-01 23:16
 */
public class Car extends Vehicle {
    @Override
    public void go() {
        System.out.println("开车");
    }
}
