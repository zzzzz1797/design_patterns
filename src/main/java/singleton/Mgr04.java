package singleton;

/**
 * @author z
 * @date 2020-04-30 23:30
 * 懒汉式加锁
 *
 * 优点：修改了多线程可能会创建多个实例的问题。
 * 缺点：效率降低了。
 */
public class Mgr04 {
    private static Mgr04 INSTANCE;

    private Mgr04() {

    }

    public static synchronized Mgr04 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Mgr04();
        }
        return INSTANCE;
    }
}
