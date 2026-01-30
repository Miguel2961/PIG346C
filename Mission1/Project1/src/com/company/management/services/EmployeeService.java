package Mission1.Project1.src.com.company.management.services;
import Mission1.Project1.src.com.company.management.model.Employee;
import java.util.ArrayList;

public class EmployeeService {
    private ArrayList<Employee> employees = new ArrayList<>();
    // add employee 
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added: " );
    }

    // list employees
    public void listEmployees() {
        if(employees.isEmpty()){
            System.out.print("not employees registered.");
            return;
        }
        for (Employee emp : employees) {
            System.out.println(emp.resum());
            
        }
    }

    // Delete employee
    public void deleteEmployee(int id) {
        // recorrer la lista de empleado. size() Para saber cuantos empleados hay en la lista
        for(int i=0; i<employees.size(); i++){
            // get(i) recore la lista de cada empleado, para veridicar su id
            if(employees.get(i).getId() == id){
                employees.remove(i);
                System.out.println("Employee with  " + id + " has been deleted.");
                return;
            }

        }
        System.out.println("Employee with ID " + id + " not found.");
    }

    // Consult employee by ID
    public void consultEmployee(int id) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                System.out.println("Employee found: "+ emp.resum());
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");

    }
}
