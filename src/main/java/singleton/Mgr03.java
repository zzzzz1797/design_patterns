package singleton;

/**
 * @author z
 * @date 2020-04-30 23:09
 * 懒汉式（lazy loading）
 * 什么时候用到什么时候初始化
 * <p>
 * 缺点：多线程访问时会有影响
 */
public class Mgr03 {
    private static Mgr03 INSTANCE;

    private Mgr03() {
    }

    public static Mgr03 getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr03();
        }
        return INSTANCE;
    }
}
