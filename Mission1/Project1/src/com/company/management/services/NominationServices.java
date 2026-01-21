package Mission1.Project1.src.com.company.management.services;

import Mission1.Project1.src.com.company.management.model.Employee;

public class NominationServices {
    public double CalculateEmploye(Employee employeee) {
               
        return employeee.getSalary() * 12;
    }
}
