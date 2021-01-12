package people;

public class Teacher extends Person {
    protected int salary;

    public Teacher(String name, String street, int salary) {
        super(name, street);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n   salary" + salary + " euros/month";
    }
}
