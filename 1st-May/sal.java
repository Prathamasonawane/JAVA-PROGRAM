//Accept Basic Salary & cal tax based on given tax


import java.util.Scanner;
public class sal{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Basic Salary:");
        double basic_sal=sc.nextDouble();
        if(basic_sal<700000)
        {
            System.out.println("No Tax");
        }
        else
        {
            double tax_amt=basic_sal*0.01;
            System.out.println("tax:"+tax_amt);
        }


    }
}