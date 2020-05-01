import org.junit.Test;
import strategy.*;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author z
 * @date 2020-05-01 00:22
 */
public class StrategyTest {
    Person[] people = {new Person(6, "张三11"), new Person(4, "李四1"), new Person(1, "王五")};
    Dog[] dogs = {new Dog(12, "旺财"), new Dog(2, "小强"), new Dog(5, "小明")};

    @Test
    public void personSort() {
        System.out.println(Arrays.asList(people));
        Sorter.sort(people);
        System.out.println(Arrays.asList(people));
    }

    @Test
    public void dogSort() {
        System.out.println(Arrays.asList(dogs));
        Sorter.sort(dogs);
        System.out.println(Arrays.asList(dogs));
    }


    @Test
    public void personNewSortWithAge() {
        System.out.println(Arrays.asList(people));
        NewSorter<Person> personNewSorter = new NewSorter<>();
        personNewSorter.sorter(people, new PersonAgeComparator());
        System.out.println(Arrays.asList(people));
    }

    @Test
    public void personNewSortWithName() {
        System.out.println(Arrays.asList(people));
        NewSorter<Person> personNewSorter = new NewSorter<>();
        personNewSorter.sorter(people, new PersonNameComparator());
        System.out.println(Arrays.asList(people));
    }
}
