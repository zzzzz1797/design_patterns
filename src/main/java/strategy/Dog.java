package strategy;

/**
 * @author z
 * @date 2020-05-01 00:25
 */
public class Dog implements Comparable<Dog> {
    int weight;
    String name;

    public Dog(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }


    @Override
    public int compareTo(Dog dog) {
        if (this.weight < dog.weight) {
            return -1;
        } else if (this.weight > dog.weight) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"weight\":")
                .append(weight);
        sb.append(",\"name\":\"")
                .append(name).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
