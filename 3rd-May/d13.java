//Print the multiplication table of a number using the * oprator..
import java.util.Scanner;

public class d13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Number:");
        int n=sc.nextInt();
        int i=1;
        while (i<=10) {
            System.out.println(n+" x " + i +" : "+(i*n));
            i++;
        }
    }
}
