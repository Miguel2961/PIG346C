package Mission1.Project1.src.com.company.management.app;

// importacion de las clases 
// El * importa todas las clases del paqute model aunque se pueda importar una por una
import Mission1.Project1.src.com.company.management.model.*;
import Mission1.Project1.src.com.company.management.services.NominationServices;
public class Main {
    public static void main(String[] args) {

    // Conocimiento general esto se llam intanciar la clase o el objecto. Employee emp1 = new Employee
    // Esto seria un llamdo ditecto desde el constructor, puede pasar que pida los datos por defecto o puede que no
    
        Employee emp1 = new Employee("Alice", 30, 50000.0);
        Manager mgr1 = new Manager("Bob", 45, 80000.0, "Sales");
        NominationServices nominationServices = new NominationServices();

    // llamdos de los metodos 
        emp1.presentperson();
        mgr1.presentperson();

    // Impresion de los dotos o del objeto como tal 
        System.out.println("Annual salary of " + emp1.getName() + " is: $" + nominationServices.CalculateEmploye(emp1));
        System.out.println("Annual salary of " + mgr1.getName() + " is: $" + nominationServices.CalculateEmploye(mgr1));
    }

}
