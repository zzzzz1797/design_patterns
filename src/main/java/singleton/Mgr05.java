package singleton;

/**
 * @author z
 * @date 2020-04-30 23:37
 * 可能还会造成多线程创建多个实例的问题
 */
public class Mgr05 {
    private static Mgr05 INSTANCE;

    private Mgr05() {

    }

    public static Mgr05 getInstance() {
        if (INSTANCE == null) {
            synchronized (Mgr05.class) {
                INSTANCE = new Mgr05();
            }
        }
        return INSTANCE;
    }
}
