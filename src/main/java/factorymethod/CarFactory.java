package factorymethod;

/**
 * @author z
 * @date 2020-05-01 22:38
 */
public class CarFactory {

    public Car create() {
        System.out.println("a car created");
        return new Car();
    }
}
