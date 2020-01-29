import java.time.LocalDate;

public class Employees {
    public static void main(String[] args) {

        EmployeeDetails[] listOfEmployees = new EmployeeDetails[2];

        int[] arr = new int[]{2, 3, 4, 5, 6};
        EmployeeDetails e1 = new EmployeeDetails(12,"Abhishek","Santhosh Jaya", Gender.MALE, LocalDate.of(1995, 04, 18),"Junior Engineer","IT",40, 24);
        listOfEmployees[0] = e1;
    EmployeeDetails e2 = new EmployeeDetails(13,"Pope","Francis", Gender.FEMALE, LocalDate.of(1976, 04, 18),"Junior Engineer","IT",12, 24);
        listOfEmployees[1] = e2;
        String FirstName = e1. getFirstName();
        String newLastName = e1.setLastName("The Rock Johnson");
        //e1.printData();
        //e1.targetSum(arr, 11);
        int[] result = e1.targetSum(arr,10);
        System.out.println("The indices are " + result[0] +" " + result[1]);
       //System.out.println.e1.targetSum(arr,11);
    /*for(EmployeeDetails e : listOfEmployees) {
        //e.printData();
        System.out.println("");
        System.out.println("**********************************************************************************");
    */}
    }



