package Mission1.Project1.src.com.company.management.model;

// Esta la clase seria el objeto hijo que hereda de la clase padre Employee

public class Manager extends Employee {
    // attributes
    private String department;
    private double bonus;

    // constructor
    public Manager(int id,String name, int age, double salary,  boolean active, char gender, String department, int housesWorked, double bonus  ) {
        super(id,name, age, active, gender, salary, housesWorked);
        this.department = department;
        this.bonus = bonus;
    }

    // getters and setters
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // methods polimorphism
    @Override
    public void presentperson() {
        System.out.println("Hello, my name is " + getName()  + ", and I manage the " + department + " department.");
    }


    @Override
    public double calculatesalary() {
        double baseSalary = super.calculatesalary();
        return baseSalary + bonus;
    }

    

    
}
