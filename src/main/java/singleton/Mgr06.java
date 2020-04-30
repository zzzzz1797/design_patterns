package singleton;

/**
 * @author z
 * @date 2020-04-30 23:40
 * <p>
 * 完美写法
 */
public class Mgr06 {
    //JIT优化时  加validate防止指令重排
    private static volatile Mgr06 INSTANCE;

    private Mgr06() {

    }

    public static Mgr06 getInstance() {
        if (INSTANCE == null) {
            synchronized (Mgr06.class) {
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Mgr06();
                }
            }
        }
        return INSTANCE;
    }
}
