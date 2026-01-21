package Mission1.Project1.src.com.company.management.app;

import Mission1.Project1.src.com.company.management.model.*;
import Mission1.Project1.src.com.company.management.services.NominationServices;
public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Alice", 30, 50000.0);
        Manager mgr1 = new Manager("Bob", 45, 80000.0, "Sales");
        NominationServices nominationServices = new NominationServices();

        emp1.presentperson();
        mgr1.presentperson();
        System.out.println("Annual salary of " + emp1.getName() + " is: $" + nominationServices.CalculateEmploye(emp1));
        System.out.println("Annual salary of " + mgr1.getName() + " is: $" + nominationServices.CalculateEmploye(mgr1));
    }

}
