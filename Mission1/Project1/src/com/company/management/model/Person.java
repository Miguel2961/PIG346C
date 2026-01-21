package Mission1.Project1.src.com.company.management.model;

// Esta la clase seria el objeto padre o super padre que hereda a los hijos
// Un padre puede tener muchos hijos pero un hijo solo puede tener un padre
// y un hijo puede tener sus propios hijos tambien

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
