//Accept a number n from the user and display the sum of even numbers up to n..

import java.util.Scanner;
public class d10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number:");
        int n=sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=n) {
            if (i%2==0) {
                sum+=i;
            }
            i++;
        }
        System.out.println("Sum of even numbers up to "+n+" is : "+sum);
    }
}
