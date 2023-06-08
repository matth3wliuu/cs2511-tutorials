package shapes;

public class Employee {
    private String name;
    private double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * This function gets the name of the Employee
     * @return a string that is the employee's name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " + "name = " + this.getName() + " salary = " + this.getSalary();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || !(obj instanceof Employee)) {
            return false;
        }

        Employee other = (Employee) obj;
        return this.getName().equals(other.getName()) && this.getSalary() == other.getSalary();
    }
}
