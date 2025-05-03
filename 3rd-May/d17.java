//Accept a character and range n,then dispaly the next n character...
import java.util.Scanner;
public class d17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Charater:");
        char ch=sc.next().charAt(0);
        System.out.println("Enter Number:");
        int n=sc.nextInt();
        int start=(int)ch;
        int end=start+n;
        while (start<end) {
            System.out.println((char)start);
            start++;
        }
    }
}
