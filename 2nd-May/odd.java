//print first N odd Numbers
import java.util.Scanner;
public class odd {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        System.out.print("Enter End : ");
        int n=sc.nextInt();
        while (i<=n) {
            if (i%2!=0) 
                System.out.print(i+"\t");
            i++;
        }
        System.out.print("\b");
    }
}
