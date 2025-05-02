//Print "Welcome" message n Times...
import java.util.Scanner;
public class welcome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Limit: ");
        int n=sc.nextInt();
        int i=1;
        while(i<=n)
        {
            System.out.println("Welcome");
            i++;
        }
    }
}
