package shapes;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    /* This is a setter method for setting an employee's salary
    * @param salary: new salary
    */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: salary = " + salary + " name = " + this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        // we know obj is an employee
        Employee other = (Employee) obj;

        return this.name.equals(other.name) && this.salary == other.salary;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("John", 100);
        Employee e2 = new Employee("John", 100);

        // e1 will never be == e2 because they occupy different memory address
        if (e1 == e2) {

        }

        if (e1.equals(e2)) {

        }

    }
}
