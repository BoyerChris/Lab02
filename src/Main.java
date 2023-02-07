import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        int weeklyHours = 0;
        double weeklyPay;

        ArrayList<Worker> listone = new ArrayList<>();

        Worker person1 = new Worker("Chris", "Boyer", "Mr", "000001", 2002, 18.5);
        listone.add(person1);

        Worker person2 = new Worker("Carra", "Lane", "Ms", "000002", 1999, 13.25);
        listone.add(person2);

        Worker person3 = new Worker("Jeff", "Little", "Mr", "000003", 1988, 22.75);
        listone.add(person3);

        SalaryWorker person4 = new SalaryWorker("Winston", "Level", "Mr", "000004", 1984, 0, 39000);
        listone.add(person4);

        SalaryWorker person5 = new SalaryWorker("Tike", "Wayne", "Mr", "000005", 1967, 0, 53000);
        listone.add(person5);

        SalaryWorker person6 = new SalaryWorker("Karen", "Birch", "Mr", "000006", 1976, 0, 47000);
        listone.add(person6);

        for (int t = 1; t < 4; t++)
        {
            if (t == 1) { weeklyHours = 40; }

            if (t == 2) { weeklyHours = 50; }

            if (t == 3) { weeklyHours = 40; }

            System.out.println("\n\n\n" + "This week was a " + weeklyHours + " hour work week");
            System.out.println("----------------------------------------------------------");
            System.out.printf("%-40s%-10s%n", "Worker Name:", "This Weeks Pay:");



            for (Worker p : listone)
            {
                p.calculateWeeklyPay(weeklyHours);
                System.out.printf("%-40s%.2f%n", p.getFullName(), p.getWeeksPay());
            }

//            System.outl.println("\n");
//
//            for (Worker p : listone)
//            {
//                System.out.println(p.displayWeeklyPay(weeklyHours));
//            }


        }


    }
}