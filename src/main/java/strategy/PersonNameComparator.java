package strategy;

import java.util.Comparator;

/**
 * @author z
 * @date 2020-05-01 21:55
 */
public class PersonNameComparator implements Comparator<Person> {
    /**
     * 按照人名的长度来排序
     *
     * @param o1
     * @param o2
     * @return
     */
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        } else if (o1.getAge() < o2.getAge()) {
            return -1;
        }
        return 0;

    }
}
