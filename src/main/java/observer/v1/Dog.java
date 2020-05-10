package observer.v1;

/**
 * @author z
 * @date 2020-05-10 19:16
 */
public class Dog implements ObServer {
    /**
     * 醒来之后的动作
     */
    @Override
    public void actionAfterWakeUp() {
        System.out.println("汪汪");
    }
}
