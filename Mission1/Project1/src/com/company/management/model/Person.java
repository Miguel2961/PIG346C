package Mission1.Project1.src.com.company.management.model;

public class Person {
    // attributes
    private String name;
    private int age;
    
    // constructor
    public Person(String name , int age){
        this.name = name;
        this.age = age;
    }
    
    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // methods
    
    public void presentperson(){
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}
