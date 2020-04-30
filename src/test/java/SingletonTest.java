import org.junit.Test;
import singleton.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author z
 * @date 2020-04-30 21:54
 */
public class SingletonTest {


    @Test
    public void testMgr01() {
        multiThreadTest(Mgr01.class);
    }

    @Test
    public void testMgr02() {
        multiThreadTest(Mgr02.class);
    }

    @Test
    public void testMgr03() {
        multiThreadTest(Mgr03.class);
    }

    @Test
    public void testMgr04() {
        multiThreadTest(Mgr04.class);
    }

    @Test
    public void testMgr05() {
        multiThreadTest(Mgr05.class);
    }

    @Test
    public void testMgr06() {
        multiThreadTest(Mgr06.class);
    }

    @Test
    public void testMgr07() {
        multiThreadTest(Mgr07.class);
    }

    @Test
    public void testMgr08() {
        multiThreadTest(Mgr08.class);


    }


    public void multiThreadTest(Class clz) {
        System.out.println(clz.getName());
        for (int i = 0; i <= 100; i++) {
            new Thread(() -> {
                try {
                    Method getInstance = clz.getMethod("getInstance");
                    System.out.println(getInstance.invoke(clz));
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
