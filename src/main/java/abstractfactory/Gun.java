package abstractfactory;

/**
 * @author z
 * @date 2020-05-01 23:17
 */
public class Gun extends Weapon {
    @Override
    public void shoot() {
        System.out.println("扫射");
    }
}
