package strategy;

/**
 * @author z
 * @date 2020-05-01 00:09
 */
public class Person implements Comparable<Person> {
    private int age;
    private String name;

    public Person() {

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
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
