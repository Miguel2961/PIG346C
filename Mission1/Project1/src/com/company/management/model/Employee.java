package Mission1.Project1.src.com.company.management.model;

public class Employee extends Person {
    // attributes
    private double salary;
    
    // constructor
    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    // getters and setters
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // methods polimorphism
    @Override
    public void presentperson() {
        System.out.println("Hello, my name is " + getName() + ", I am " + getAge() + " years old, and my salary is $" + salary + ".");
    }
}
