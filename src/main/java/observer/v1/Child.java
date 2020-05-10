package observer.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author z
 * @date 2020-05-10 19:16
 */
public class Child {
    private List<ObServer> obServers = new ArrayList<ObServer>();
    private boolean isWakeup = false;

    {
        obServers.add(new Dog());
        obServers.add(new Dad());
        obServers.add(new Mum());
    }

    public boolean isWakeup() {
        return isWakeup;
    }

    public void wakeup() {
        isWakeup = true;
        for (ObServer observer : obServers) {
            observer.actionAfterWakeUp();
        }
    }
}
