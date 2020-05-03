package abstractfactory;

/**
 * @author z
 * @date 2020-05-01 23:23
 */
public abstract class AbstractFactory {
    public abstract Food createFood();

    public abstract Vehicle createVehicle();

    public abstract Weapon createWeapon();
}
