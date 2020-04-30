import org.junit.Test;
import strategy.Dog;
import strategy.Person;
import strategy.Sorter;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author z
 * @date 2020-05-01 00:22
 */
public class StrategyTest {

    @Test
    public void personSort() {
        Person[] people = {new Person(6, "张三"), new Person(4, "李四"), new Person(1, "王五")};
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
}
