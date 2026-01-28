package Mission1.Project1.src.com.company.management.app;

// importacion de las clases 
// El * importa todas las clases del paqute model aunque se pueda importar una por una
import Mission1.Project1.src.com.company.management.model.*;
import Mission1.Project1.src.com.company.management.services.NominationServices;
public class Main {
    public static void main(String[] args) {
        // varible 
        int months = 4;
        double [] salarys = {50000.0, 60000.0, 55000.0, 70000.0};
 
    // Conocimiento general esto se llam intanciar la clase o el objecto. Employee emp1 = new Employee
    // Esto seria un llamdo ditecto desde el constructor, puede pasar que pida los datos por defecto o puede que no
    
        Employee emp1 = new Employee(1,"Alice", 30, true, 'F', 50000.0, 160 );
        Manager mgr1 = new Manager(2,"Bob", 61, 80000.0, true, 'M', "Sales", 160, 10000.0);
        NominationServices nominationServices = new NominationServices();

    // llamdos de los metodos 
        emp1.presentperson();
        mgr1.presentperson();

    // Impresion de los dotos o del objeto como tal
        System.out.println("\n*** EMPLOYEE #1 ***"); 
        System.out.println("\nEmployee Details:\n");
        emp1.presentperson();
        System.out.println("Annual salary of " + emp1.getName() + " is: $" + nominationServices.CalculateEmploye(emp1));
        System.out.println("status of worked: " + emp1.worked());
        System.err.println("the employee is working status: " + emp1.classEmployee());
        System.out.println("gender of employee: " + emp1.typeofEmployee());
        
        System.out.println("\n*** EMPLOYEE #2 ***");
        System.out.println("\nManager Details:\n");
        mgr1.presentperson();
        System.out.println("Annual salary of " + mgr1.getName() + " is: $" + nominationServices.CalculateEmploye(mgr1));
        System.out.println("status of worked: " + mgr1.worked());
        System.err.println("the employee is working status: " + mgr1.classEmployee());
        System.out.println("gender of employee: " + mgr1.typeofEmployee());
        
        System.out.println("\n*** NOMINATION SERVICES ***");
        System.out.println("calculate total nomination of employees: $"+nominationServices.Calculatenomination(salarys));

        System.out.println("\n*** SIMULATE PAYMENT ***");
        nominationServices.simulatepayment(months);
    }

}
