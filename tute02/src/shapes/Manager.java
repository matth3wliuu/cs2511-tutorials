package shapes;

import java.time.LocalDate;

public class Manager extends Employee {

    private LocalDate hireDate;

    public Manager(String name, double salary, LocalDate hireDate) {
        super(name, salary);
        this.hireDate = hireDate;
    }

    public void doSomething(Employee e) {
    }

    public static void main(String[] args) {
        Manager m1 = new Manager("zac", 0, LocalDate.of(2023, 6, 8));
        Manager m2 = new Manager("zac", 0, LocalDate.of(2023, 6, 8));

        m2.doSomething(m1);
    }

    @Override
    public String toString() {
        return "Manager: hireDate = " + this.hireDate + super.toString();
    }

}
