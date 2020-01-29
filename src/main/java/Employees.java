import java.time.LocalDate;

public class Employees {
    public static void main(String[] args) {
    EmployeeDetails e1 = new EmployeeDetails(12,"Abhishek","Santhosh Jaya", LocalDate.of(1995, 04, 18),"Junior Engineer","IT",40, 24);
    EmployeeDetails e2 = new EmployeeDetails(13,"Pope","Francis", LocalDate.of(1976, 04, 18),"Junior Engineer","IT",12, 24);
        e1.printData();
        System.out.println("");
        System.out.println("**********************************************************************************");
        System.out.println("");
        e2.printData();
    }


}
