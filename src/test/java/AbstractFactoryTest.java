import abstractfactory.*;
import org.junit.Test;

/**
 * @author z
 * @date 2020-05-01 23:18
 */
class Common extends AbstractFactory {


    @Override
    public Food createFood() {
        return new Bread();
    }

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }

    @Override
    public Weapon createWeapon() {
        return new Gun();
    }
}

class Magic extends AbstractFactory {

    @Override
    public Food createFood() {
        return new MushRoom();
    }

    @Override
    public Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    public Weapon createWeapon() {
        return new MagicStick();
    }
}

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new Common();
        abstractFactory.createFood().printName();
        abstractFactory.createVehicle().go();
        abstractFactory.createWeapon().shoot();
    }
}
