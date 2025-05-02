import java.util.Scanner;

public class loan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your loan Amount:");
        double loan_amt=sc.nextDouble();
        System.out.println("Enter Duration:(6 or 12 month):");
        int month=sc.nextInt();
        double interest_rate;
        if (month==6) {
            interest_rate=0.02;
            
        }
        else
        {
            interest_rate=0.03;
        }
        
        double tot_int=loan_amt*interest_rate;
        double EMI=(loan_amt+tot_int)/month;
        System.out.println("Total Interest:"+tot_int+"Rs:");
        System.out.println("EMI:"+EMI+"RS:");
    }
    
}
