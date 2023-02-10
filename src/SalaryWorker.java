public class SalaryWorker extends Worker
{
    private double annualSalary;
    private double weeksPay;
    private String displayWeeklyPay;




    public SalaryWorker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPayRate, double annualSalary)
    {
        super(firstName, lastName, ID, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }




    @Override
    public double calculateWeeklyPay(double weeklyHours) {
        weeksPay = annualSalary / 52;
        return weeksPay;
    }
    @Override
    public String displayWeeklyPay(double weeklyHours) {
        displayWeeklyPay = "1 Week's pay: " + weeksPay;
        return displayWeeklyPay;
    }



    public double getAnnualSalary() {
        return annualSalary;
    }

    @Override
    public double getWeeksPay() {
        return weeksPay;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public void setWeeksPay(double weeksPay) {
        this.weeksPay = weeksPay;
    }
}
