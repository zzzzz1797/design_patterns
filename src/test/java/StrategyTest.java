import org.junit.Test;
import strategy.Dog;
import strategy.NewSorter;
import strategy.Person;
import strategy.Sorter;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author z
 * @date 2020-05-01 00:22
 */
public class StrategyTest {
    Person[] people = {new Person(6, "张三11"), new Person(4, "李四1"), new Person(1, "王五")};

    @Test
    public void personSort() {
        System.out.println(Arrays.asList(people));
        Sorter.sort(people);
        System.out.println(Arrays.asList(people));
    }

    @Test
    public void dogSort() {
        Dog[] dogs = {new Dog(12, "旺财"), new Dog(2, "小强"), new Dog(5, "小明")};
        System.out.println(Arrays.asList(dogs));
        Sorter.sort(dogs);
        System.out.println(Arrays.asList(dogs));
    }


    @Test
    public void personNewSort() {
        System.out.println(Arrays.asList(people));
        NewSorter<Person> personNewSorter = new NewSorter<>();
        personNewSorter.sorter(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getName().length() > o2.getName().length()) {
                    return 1;
                } else if (o1.getName().length() < o2.getName().length()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println(Arrays.asList(people));
    }
}
