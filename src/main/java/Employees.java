import java.time.LocalDate;

public class Employees {
    public static void main(String[] args) {

        EmployeeDetails[] listOfEmployees = new EmployeeDetails[2];


        EmployeeDetails e1 = new EmployeeDetails(12,"Abhishek","Santhosh Jaya", Gender.MALE, LocalDate.of(1995, 04, 18),"Junior Engineer","IT",40, 24);
        listOfEmployees[0] = e1;
    EmployeeDetails e2 = new EmployeeDetails(13,"Pope","Francis", Gender.FEMALE, LocalDate.of(1976, 04, 18),"Junior Engineer","IT",12, 24);
        listOfEmployees[1] = e2;

    for(EmployeeDetails e : listOfEmployees) {
        e.printData();
        System.out.println("");
        System.out.println("**********************************************************************************");
    }
    }


}
