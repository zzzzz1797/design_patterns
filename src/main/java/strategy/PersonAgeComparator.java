package strategy;

import java.util.Comparator;

/**
 * @author z
 * @date 2020-05-01 21:56
 */
public class PersonAgeComparator implements Comparator<Person> {
    /**
     * 按照人的年龄排序
     *
     * @param o1
     * @param o2
     * @return
     */
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getName().length() > o2.getName().length()) {
            return 1;
        } else if (o1.getName().length() < o2.getName().length()) {
            return -1;
        }
        return 0;
    }
}
