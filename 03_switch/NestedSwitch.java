import java.util.Scanner;
public class NestedSwitch{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int empId = input.nextInt();
        java.lang.String department = input.next();

        switch(empId){
            case 1:
                System.out.println("krushna");
                break;
            case 2:
                System.out.println("kunal");
                break;
            case 3:
                System.out.println("employee id 3");
                switch(department){
                    
                    case "HR":
                        System.out.println("Employee is in HR department.");
                        break;
                    case "IT":
                        System.out.println("Employee is in IT department.");
                        break;
                    case "Finance":
                        System.out.println("Employee is in Finance department.");
                        break;
                    default:
                        System.out.println("Unknown department.");
                }
                break;
            default:
                System.out.println("Unknown employee ID.");
        }
    }
}