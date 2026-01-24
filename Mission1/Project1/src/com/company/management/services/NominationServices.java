package Mission1.Project1.src.com.company.management.services;

import Mission1.Project1.src.com.company.management.model.Employee;

public class NominationServices {
    public double CalculateEmploye(Employee employeee) {
               
        return employeee.getSalary() * 12;
    }

    public double Calculatenomination(double[] salarys) {
        double total=0; // acumulador total += salarys[i]; y contador  i++
        for(int i=0; i<salarys.length; i++ ){
            total += salarys[i];
        }
        
        return total;
    }
}
