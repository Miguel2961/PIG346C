package Mission1.Project1.src.com.company.management.model;

public class Manager extends Employee {
    // attributes
    private String department;
    
    // constructor
    public Manager(String name, int age, double salary, String department) {
        super(name, age, salary);
        this.department = department;
    }

    // getters and setters
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // methods polimorphism
    @Override
    public void presentperson() {
        System.out.println("Hello, my name is " + getName()  + ", and I manage the " + department + " department.");
    }
    

    
}
