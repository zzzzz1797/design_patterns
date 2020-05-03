import factorymethod.Car;
import factorymethod.CarFactory;
import org.junit.Test;

/**
 * @author z
 * @date 2020-05-01 22:39
 */
public class FactoryMethodTest {

    @Test
    public void carFactoryTest(){
        Car car = new CarFactory().create();
        car.go();

    }
}
