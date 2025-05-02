import java.util.Scanner;
public class digit {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Your Number:");
    int num=sc.nextInt();
        if (num>=0 && num<=9) {
            System.out.println(num + " is 1-digit number");
        }
        else if (num>=10 && num<=99) {
            System.out.println(num + " is 2-digit number");
   
        }
        else if (num>=100 && num<=999) {
            System.out.println(num + " is 3-digit number");
   
        }
        else if (num>=1000 && num<=9999) {
            System.out.println(num + " is 4-digit number");
   
        }
}
    
}
