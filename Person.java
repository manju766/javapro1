public class Person {
    private String name;
    private String dateOfBirth;

    public Person(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public void displayPersonName() {
        System.out.println("Person Name: " + name);
    }

    public void displayPersonAge() {
        System.out.println("Date of Birth (input for age verification): " + dateOfBirth);
    }
}
