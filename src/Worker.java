public class Worker extends Person
{
    private double hourlyPayRate;
    private double weeksPay;
    private String displayWeeklyPay;




    public Worker(String fName, String lName, String title, String iD, int yob, double hourlyPayRate) {
        super(fName, lName, title, iD, yob);
        this.hourlyPayRate = hourlyPayRate;
    }




    public double calculateWeeklyPay(double weeklyHours) {
        if (weeklyHours <= 40.0) {
            weeksPay = weeklyHours * hourlyPayRate;
        } else {
            weeksPay = (40 * hourlyPayRate) + ((weeklyHours - 40) * (hourlyPayRate * 1.5));
        }
        return weeksPay;
    }
    public String displayWeeklyPay(double weeklyHours) {
        if (weeklyHours <= 40.0) {
            displayWeeklyPay = "Regular Pay: " + weeksPay + ", Overtime Pay: 0" + ", Overall Pay: " + weeksPay;
        } else {
            displayWeeklyPay = "Regular Pay: " + 40 * hourlyPayRate + ", Overtime Pay: " + (weeklyHours - 40) * (hourlyPayRate * 1.5) + ", Overall Pay: " + weeksPay;
        }
        return displayWeeklyPay;
    }




    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public double getWeeksPay() {
        return weeksPay;
    }

}
