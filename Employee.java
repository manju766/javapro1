class Employee extends Person {
    private String empId;
    private double salary;

    public Employee(String name, String dateOfBirth, String empId, double salary) {
        super(name, dateOfBirth);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        displayPersonName();
        displayPersonAge();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }
}
