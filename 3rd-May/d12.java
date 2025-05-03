//Accept two numbers n and m from the user and print the sum of number between n and m...


import java.util.Scanner;
public class d12 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the First Number (n)");
    int n=sc.nextInt();
    System.out.println("Enter the Second Number (m)");
    int m=sc.nextInt();
    int sum=0;
    while (n<=m) {
        sum+=n;
        n++;
    }
    System.out.println("The sum of number Between n and m is "+sum);
}    
}
