//print numbers from 100 to 1 in descending order...
import java.util.Scanner;
public class d4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter End: ");
        int i=sc.nextInt();
        System.out.print("Enter start: ");
        int n=sc.nextInt();
        while(i>=n)
        {
            System.out.println("i: "+i);
            i--;
        }

    }
}
