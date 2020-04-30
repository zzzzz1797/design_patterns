package singleton;

/**
 * @author z
 * @date 2020-04-30 23:07
 */
public class Mgr02 {
    private static final Mgr02 INSTANCE;

    static {
        INSTANCE = new Mgr02();
    }

    public static Mgr02 getInstance() {
        return INSTANCE;
    }
}
