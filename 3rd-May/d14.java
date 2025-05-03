//Print the multiplication table of a number without using the * oprator..
/*import java.util.Scanner;

public class d14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Number:");
        int n=sc.nextInt();
        int i=n;
        while (i<=n*10) {
            System.out.println(i);
            i+=n;
        }

    }
}
*/
import java.util.Scanner;

public class d14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Number:");
        int n=sc.nextInt();
        int i=1;
        int j=n;
        while (i<=10) {
            System.out.println(j);
            j=j+n;
            i++;
        }

    }
}