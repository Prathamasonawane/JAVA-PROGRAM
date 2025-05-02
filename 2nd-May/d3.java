//Print numbers from 100 to 5000, incrementing by 50
import java.util.Scanner;
public class d3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Start: ");
        int i=sc.nextInt();
        System.out.print("Enter End: ");
        int n=sc.nextInt();
        while(i<=n)
        {
            System.out.println("i: "+i);
            i+=50;
        }

    }
    
}
