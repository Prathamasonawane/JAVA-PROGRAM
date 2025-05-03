//Calculate the Factorial of a given Number...
import java.util.Scanner;
public class d15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number:");
        int n=sc.nextInt();
        int i=n;
        int fact=1;
        while (i>=1) {
            System.out.println(i);
            fact*=i;
            i--;
        }
        System.out.println("Factorial of "+n+ " is = "+fact);
    }
}
