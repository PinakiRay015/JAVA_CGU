package lab2;
import java.util.Scanner;
public class year {
    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the year ");
        int a = java.nextInt();
        if(a%4==0)
        {
            if(a%100==0)
            {
                if(a%400==0)
                {
                    System.out.printf("%d is a leap year" , a);
                }
                else
                {
                    System.out.printf("%d is not a leap year" , a);
                }
            }
            else
            {
                System.out.printf("%d is a leap year" , a);
            }
        }
        else
        {
            System.out.printf("%d is not a leap year" , a);
        }
        java.close();
    }
}
