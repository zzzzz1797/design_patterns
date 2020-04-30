package singleton;

/**
 * @author z
 * @date 2020-04-30 23:51
 * <p>
 * 不仅可以解决线程同步，还可以防止反序列化（因为没有构造方法）
 */
public enum Mgr08 {
    INSTANCE;

    public static Mgr08 getInstance() {
        return INSTANCE;
    }
}
