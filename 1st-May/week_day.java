import java.util.Scanner;
public class week_day {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Age of Customer:");
        int age=sc.nextInt();
        System.out.println("1.Monday");
        System.out.println("2.Tuesday");
        System.out.println("3.Wednesday");
        System.out.println("4.Thursday");
        System.out.println("5.Friday");
        System.out.println("6.Saturday");
        System.out.println("7.Sunday");
        System.out.print("Enter day:");
        int day=sc.nextInt();
        if (day>=1 && day<=5)
         {
            System.out.println("weekday");    
            //----------------------------
            if(age<=13)
            {
                System.out.println("Ticket Price:100 Rs.");

            }
            else if(age>13 && age<=64)
            {
                System.out.println("Ticket Price:150 Rs.");
            }
            else
            {
                System.out.println("Ticket Price:130 Rs.");
            }
            //-----------------------------------
        }
        else
        {
            System.out.println("weekday");    
            //----------------------------
            if(age<=13)
            {
                System.out.println("Ticket Price:120 Rs.");

            }
            else if(age>13 && age<=64)
            {
                System.out.println("Ticket Price:180 Rs.");
            }
            else
            {
                System.out.println("Ticket Price:150 Rs.");
            }
            //-----------------------------------
        }
    }
}
