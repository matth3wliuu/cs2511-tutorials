package employee;

import java.time.LocalDate;

import access.package2.E;

// Extends means Manager is a subclass of Employee
public class Manager extends Employee {

    private LocalDate hireDate;

    public Manager(String name, double salary, LocalDate hireDate) {
        super(name, salary);
        this.hireDate = hireDate;
    }

    public LocalDate getHireDate() {
        return this.hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    // * toString is a method that exists in the Object class and the Object is the super class of every class in Java

    @Override
    public String toString() {
        String output = "Name = " + super.getName() + " Salary: " + super.getSalary() + " hireDate: " + getHireDate();
        return output;
    }

    // ? what does the toString method do? to get a string representation of our instance
    // ? why is this useful? useful for debugging because we might want to view the values of a particular at a particular time

    //* == sign is used to compare if two things are in same in other languages such as C
    //! == sign in Java is used to compare MEMORY addresses

    @Override
    public boolean equals(Object obj) {
        // if (obj == this) return false;

        if (obj == null) return false;

        // if obj and this are of different classes, return false;
        if (obj.getClass() != this.getClass()) return false;

        // it converts obj into an instance of Manager
        Manager rhs = (Manager) obj;

        //! this.getName().equals(rhs.getName()) should be the same as rhs.getName().equals(this.getName())

        //! compare every single property between rhs and this to check if they are the same
        return this.getName().equals(rhs.getName()) && this.getHireDate().equals(rhs.getHireDate()) && this.getSalary() == rhs.getSalary();
    }

    // ! only use == if the two things you're comparing are not actually instances of some class (i.e. only valid for primitive types like int or double etc)

    public static void main(String[] args) {
        Employee e1 = new Employee("matt", 15);

        LocalDate date = LocalDate.of(2020, 1, 8);
        Manager m1 = new Manager("nick", 150, date);

        // m2 should be the same as m1 becuase it has all of the same values
        Manager m2 = new Manager("nick", 150, date);
        Manager m3 = new Manager("jack", 150, date);

        // this will print false because m1 and m2 occupy different memory addresses
        // System.out.println(m1 == m2);

        // // we want this to print true
        // System.out.println(m1.equals(m2));

        System.out.println(m1.equals(m1));
        System.out.println(m1.equals(m3));

        // System.out.println(m1.getHireDate());
        // System.out.println(m1.getSalary());

        // System.out.println(m1.toString());
        // System.out.println(m1);
    }
}
