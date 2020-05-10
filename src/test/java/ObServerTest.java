import observer.v1.Child;
import observer.v2.AwtFrame;
import org.junit.Test;

/**
 * @author z
 * @date 2020-05-10 19:20
 */
public class ObServerTest {


    @Test
    public void testV1(){
        Child child = new Child();
        child.wakeup();
    }

    @Test
    public void TestV2(){
        new AwtFrame().launch();
    }
}
