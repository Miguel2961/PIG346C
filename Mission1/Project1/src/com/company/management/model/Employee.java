package Mission1.Project1.src.com.company.management.model;
// Esta la clase seria el objeto hijo que hereda de la clase padre Person

public class Employee extends Person {
    // attributes
    private double salary;
    private int housesWorked;
    
    // constructor
    public Employee(String name, int age, boolean active, char gender, double salary, int housesWorked) {
        super(name, age, active, gender);
        this.salary = salary;
        this.housesWorked = housesWorked;
    }

    // getters and setters
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getHousesWorked() {
        return housesWorked;
    }

    public void setHousesWorked(int housesWorked) {
        this.housesWorked = housesWorked;
    }

    // methods polimorphism
    @Override
    public void presentperson() {
        System.out.println("Hello, my name is " + getName() + ", I am " + getAge() + " years old, and my salary is $" + salary + ".");
    }

    // method to calculate salary based on hours worked
    public double calculatesalary() {
        double valuesalary = salary/160;
        double totalsalary = valuesalary * housesWorked;
        return totalsalary;
              
    }

    public boolean olderyears(){
        return getAge()>=18;
    }
    public boolean worked(){
        return getAge() >=18 && active == true;
    }
    
}
