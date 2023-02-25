package overtimeCalculator;

public class EmployeeOvertimeData {

    private double income;
    private int workedHours;
    private int workingHoursInCurrentMonth;
    private double methodOfPayment;
    private double overtime;

    EmployeeOvertimeData() {

    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workingHours) {
        this.workedHours = workingHours;
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    public int getWorkingHoursInCurrentMonth() {
        return workingHoursInCurrentMonth;
    }

    public void setWorkingHoursInCurrentMonth(int workingHoursInCurrentMonth) {
        this.workingHoursInCurrentMonth = workingHoursInCurrentMonth;
    }

    public double getMethodOfPayment() {
        return methodOfPayment;
    }

    public void setMethodOfPayment(double methodOfPayment) {
        this.methodOfPayment = methodOfPayment;
    }

}
