//Accept a Number n from the user and display the sum of natural number up to n...
import java.util.Scanner;
public class d9{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number:");
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        while (i<=n) {
            System.out.println(i);
            sum+=i;
            i++;
        }
        System.out.println("Sum : "+sum);
    }
}