//Divisible By 17 or Not
import java.util.Scanner; 
public class div_by_17
 {
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
            if (num%17==0)
             {
                System.out.println(num+" is divisible by 17:");    
            }
            else
            {
                System.out.println(num+" is not divisible by 17:");
            }
    }

}
