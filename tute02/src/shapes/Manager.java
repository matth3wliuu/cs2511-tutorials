package shapes;

import java.time.LocalDate;

public class Manager extends Employee {

    private LocalDate hireDate;

    Manager(String name, double salary, LocalDate hireDate) {
        super(name, salary);
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return super.toString() + " hireDate = " + this.hireDate;
    }

    public LocalDate getHireDate() {
        return this.hireDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }

        if (!(obj instanceof Manager)) {
            return false;
        }

        Manager m = (Manager) obj;

        return this.hireDate.equals(m.getHireDate());
    }

    public void test(Employee e) {

    }

    public static void main(String[] args) {
        Manager m = new Manager("Anton", 10, null);
        Manager n = new Manager("Anton", 10, null);

        m.test(n);
    }
}
