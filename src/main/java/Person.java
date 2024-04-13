import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {
//    Создайте класс Person с полями firstName, lastName и age.
//    Используйте библиотеку commons-lang3 для генерации методов toString, equals и hashCode.
//    Используйте библиотеку gson для сериализации и десериализации объектов класса Person в формат JSON.

    private String firstName = "Олег";
    private String lastName  = "Новак ";
    private int age = 10;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() &&
                getFirstName().equals(person.getFirstName()) &&
                getLastName().equals(person.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getAge());
    }
}

