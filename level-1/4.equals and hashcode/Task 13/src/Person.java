import java.util.Objects;

public  class Person {

    int id;
    String name;

    public Person() {}
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Equality based on id
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass()  != obj.getClass())
            return false;
        Person person = (Person) obj;
        return this.id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
