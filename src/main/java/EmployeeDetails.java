import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ChronoUnit;

import static java.util.Calendar.YEAR;

enum Gender{
    MALE,
    FEMALE,
    OTHERS
}
public class EmployeeDetails {

    private int employeeId;
    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate dateOfBirth;
    private long ageInYears;
    private String designation;
    private String department;
    private int hoursWorked;
    private double salary;
    private double boostedSalary;
    private String remarks;

    public EmployeeDetails(int employeeId, String firstName, String lastName, Gender gender, LocalDate dateOfBirth, String designation, String department, int hoursWorked, double salary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.ageInYears = calculateAge();
        this.designation = designation;
        this.department = department;
        this.hoursWorked = hoursWorked;
        this.salary = salary;
        this.boostedSalary = getBonus();
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String setLastName(String lastName) {
        this.lastName = lastName;
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        //this.salary = salary;
    }

    public long calculateAge(){
        long age = this.dateOfBirth.until(LocalDate.now(), ChronoUnit. YEARS);
        return age;
    }

    public double getBonus(){
        if (hoursWorked > 30){
            return (this.salary * 1.2);
        }
        else
        return this.salary;
    }

    public void printData() {
       System.out.println("Employee ID:" + this.employeeId);
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Gender: " + this.gender);
        System.out.println("Date of Birth: " + this.dateOfBirth);
        System.out.println("Age: " + this.ageInYears);
        System.out.println("Designation:" + this.designation);
        System.out.println("Department:" + this.department);
        System.out.println("Hours Worked:" + this.hoursWorked);
        System.out.println("Salary:" + salary);
        System.out.println("Boosted Salary:" + this.boostedSalary);
        if(this.hoursWorked > 35){
            this.remarks = "Hard Worker";
            System.out.println("Additional Remarks: " + this.remarks);
        }
        else
        { this.remarks = "Average Worker";
            System.out.println("Additional Remarks: " + this.remarks);
        }
    }
}

