package factorymethod;

/**
 * @author z
 * @date 2020-05-01 22:36
 */
public class VehicleFactory {
    public Car createCar() {
        return new Car();
    }

    public Subway createSubway(){
        return new Subway();
    }
}
