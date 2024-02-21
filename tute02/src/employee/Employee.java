package employee;


/* shift + cmd + p and search "getters and setters" to autmomatically generate them */
public class Employee {

    // protected double blah;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * This a getter function for name
     * @return name which is string representing the employee's name
     */
    public String getName() {
        return this.name;
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

    // * toString and equals are methods we inherited from the Object class

    @Override
    public String toString() {
        // ? why might want a function that can convert our object into a string?
        // * easy view to view the data inside the object and error checking (ibrahim)

        return "Employee has name = " + name + " salary = " + salary;
    }

    @Override
    // ? why is the signature not public boolean equals(Employee other)
    // * we allow users to compare any pair of objects
    // * from the perspective of the Object class, it does not know what classes
    // will be created by a programmer and subsequently extend it. So, the most
    // generic assumption that the Object class can make is that the new extends
    // Object
    public boolean equals(Object other) {
        if (this == other) return true;

        // return false if other is not an instance of Employee or a subclass of Employee
        // should a subclass be equal to me, if so, then use instanceof
        // if (!(other instanceof Employee)) return false;

        if (this.getClass() != other.getClass()) return false;

        // we can now say that other and this are of the same class
        Employee rhs = (Employee) other;

        // this does not work because the salary attribute does not exist in
        // the Object class
        // ! double x = other.salary;

        return this.salary == rhs.salary && this.name.equals(rhs.name);
    }

    private String name;
    private double salary;
}
