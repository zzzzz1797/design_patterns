package strategy;

/**
 * @author z
 * @date 2020-05-01 00:09
 */
public class Person implements Comparable<Person> {
    int age;
    String name;

    public Person() {

    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public int compareTo(Person person) {
        if (this.age < person.age) {
            return -1;
        } else if (this.age > person.age) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"age\":")
                .append(age);
        sb.append(",\"name\":\"")
                .append(name).append('\"');
        sb.append('}');
        return sb.toString();
    }

}
