package singleton;

/**
 * @author z
 * @date 2020-04-30 23:45
 * <p>
 * 静态内部类
 * JVM保证单例
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 */
public class Mgr07 {
    private Mgr07() {

    }

    private static class Mgr07Handler {
        private final static Mgr07 INSTANCE = new Mgr07();
    }

    public static Mgr07 getInstance() {
        return Mgr07Handler.INSTANCE;
    }
}
