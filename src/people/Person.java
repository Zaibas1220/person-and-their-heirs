package people;

public class Person {
    protected String name;
    protected String street;

    public Person (String name, String street){
        this.name = name;
        this.street = street;
    }

    @Override
    public String toString() {
        return name + "\n  " + street;
    }
}
