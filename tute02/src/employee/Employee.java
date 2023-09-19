package employee;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // * getters: methods that return a value from within the class
    public String getName() {
        return this.name;
    }

    public String getNameUppercase() {
        String upper = name.toUpperCase();
        return upper;
    }

    // * setters: methods that allows us to change the value within a class
    public void changeSalary(double newSalary) {
        if (newSalary <= 0) return;
        this.salary = newSalary;
    }

    // * auto generate getters and setters
    // shift + (command|ctrl) + p and type in generate getters and setters

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
