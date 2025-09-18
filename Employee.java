/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        /* Pseudo-code:
         * 1.getValue yearOfBirth
         * 2.setcurrentYear to 2025
         * 3.calculateAge(currentYear - YearOfBirth);
         * 4. if calculateAge >=16
         *      system.out.print("You can now legally drive!")
         * 5.  else
         *      calculateAge < 16
         *      calculateAgeDrive (16 - calculateAge)
         *      system.out.print("You have" + calculateAgeDrive + " years left before driving");
           */
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        /*Pseudo-code:
         * 1.getValue unpaidHours and hourlyWage
         * set calculatePay to (unpaidHours * hourlyWage - 30%
         * system.out.print(calculatePay + " is your net pay after taxes");
           */
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        /*Pseudo-code:
         * 1.getpaySalary() value from calculatePay()
         * 2. Get String fullname;
         * 3.system.out.print(String fullname +" has received a wire transfert of " + paySalary)
         *    then unpaidHours to 0
           */
    }

}