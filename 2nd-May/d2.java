//print 1 to user specified number n..
import java.util.Scanner;
public class d2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number:");
        int n=sc.nextInt();
        int i=1;
        while (i<=n) {
            System.out.println("i:"+i);
            i++;
        }
    }
}
