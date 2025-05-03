//Compute the power of a number m^n....
/*import java.util.Scanner;
public class d16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the m:");
        double m=sc.nextDouble();
        System.out.println("Enter the n:");
        int n=sc.nextInt();
        double res=1;
        int pow=n;
        while (pow>0) {
            res*=m;
            pow--;
        }
        System.out.println(m+"^"+n+"="+res);

    }
}
*/
import java.util.Scanner;
public class d16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        double m=sc.nextDouble();
        System.out.println("Enter the Power:");
        int n=sc.nextInt();
        int i=1;
        int ans=1;
        while (i<=n) {
           ans*=m;
           i++;
        }
        System.out.println("Power : "+n+" Of "+m+" is : "+ans);

    }
}