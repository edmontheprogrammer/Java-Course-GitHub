package edmontheprogrammer;

public class Employee {
    private  int baseSalary;
    private   int hourlyRate;

    // you declare static members after declaring the instance members
    public static int numberOfEmployees;

    public Employee(int baseSalary) {
        this(baseSalary, 0);
    }
    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    // Add static methods here after the constructors
    public static void printNumberOfEmployees() {
        System.out.println(numberOfEmployees);
    }


    public int calculateWage(int extraHours) {

        return baseSalary + (hourlyRate * extraHours);
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less");
        this.baseSalary = baseSalary;
    }

    /*
        * Making this method private reduces the coupling and complexity in this program.
        * This is an example of making the "Main" class less dependent on the "Employee"
        *  class.
        * Now if we go back to the "Main" class and call "employee." the "getBaseSalary()"
        * and the "getHourlyRate()" is not visible in the "Main" class and the interface for
        * this class is simpler we only see the three public methods that we
        * created here in the "Employee" class.
     */
    private int getBaseSalary() {
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate cannot be 0 or negative");
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

}
