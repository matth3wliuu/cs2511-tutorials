package employee;

import java.time.LocalDate;

public class Manager extends Employee {
    public Manager(String name, double salary, LocalDate hireDate) {
        super(name, salary);
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        // double b = super.blah;
        return super.toString() + " hire date = " + hireDate;
    }

    @Override
    public boolean equals(Object other) {
        if (!super.equals(other)) return false;

        Manager rhs = (Manager) other;

        return this.hireDate.equals(rhs.hireDate);
    }

    private LocalDate hireDate;

    public static void main(String[] args) {
        Manager m = new Manager("Mike", 1000, LocalDate.now());
        System.out.println(m); // same result as System.out.println(m.toString());

        int x = 4;
        int y = 5;

        System.out.println(x == 4);

        Manager m1 = new Manager("Mike", 1000, LocalDate.now());

        // false is printed and this is because in Java, `==` compare memory addresses
        System.out.println(m == m1);
    }
}
