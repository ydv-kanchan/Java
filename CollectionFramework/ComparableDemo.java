package CollectionFramework;
import java.util.*;;
class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age); // Sorting by age
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35)
        );

        Collections.sort(people); // Sorts using the natural order defined in compareTo
        System.out.println(people);
    }
}
