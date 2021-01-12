package people;

public class Student extends Person {
    protected int credit;

    public Student(String name, String street) {
        super(name, street);
        credit = 0;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  credits " + credit;
    }

    public void study(){
        credit += 1;
    }
}
