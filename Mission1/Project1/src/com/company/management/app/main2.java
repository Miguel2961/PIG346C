package Mission1.Project1.src.com.company.management.app;
import Mission1.Project1.src.com.company.management.model.Employee;
import Mission1.Project1.src.com.company.management.services.EmployeeService;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService();
        int option;

        do{
            System.out.println("\n ***Menu Employee***");
            System.out.println("1. Add Employee");
            System.out.println("2. List Employees");
            System.out.println("3. Consult Employee");
            System.out.println("4. Delete Employee");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");
            option = sc.nextInt();
            
             

             // consume newline

            switch (option) {
                case 1:
                    // Capturar datos del empleado
                    System.out.print("ID of employee: ");
                    int id = sc.nextInt();
                    
                    System.out.println("name of employee: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    

                    System.out.print("age of employee: ");
                    int age = sc.nextInt();

                    System.out.println("gender of employee: ");
                    char gender = sc.next().charAt(0);

                    System.out.print("salary of employee: ");
                    double salary = sc.nextDouble();

                    System.out.println("Employee active (true/false): ");
                    boolean isActive = sc.nextBoolean();

                    System.out.print("Hours worked of employee: ");
                    int hoursWorked = sc.nextInt();  
                     
                    Employee emp = new Employee(id,name, age, isActive, gender, salary, hoursWorked);
                    employeeService.addEmployee(emp);
                    break;
                case 2:
                    System.out.println("List of Employees:");
                    employeeService.listEmployees();
                    break;
                case 3:
                    System.out.print("Enter Employee ID to cons: ");
                    int consul = sc.nextInt();
                    employeeService.consultEmployee(consul);
                    break;

                case 4:
                    System.out.print("Enter Employee ID to delete: "); 
                    employeeService.deleteEmployee(sc.nextInt());
                    break;
                case 0:
                    System.out.println("Exiting the application.");
                    
                    break;
                default:
                    System.out.println("Invalid option. Please try again. (0-5)");
                    
            }

        }while(option != 0);
        sc.close();

    }

}
