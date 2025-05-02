//Check weather the a leap year or not
import java.util.Scanner;
public class leap_year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Year:");
        int year=sc.nextInt();
        if(year%4==0)
        {
            System.out.println(year+" Is Leap Year...");
        }
        else
        {
            System.out.println(year+" Is Not Leap Year...");
        }
    }
}
