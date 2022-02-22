package lab2;
import java.util.Scanner;
public class largest3 {
    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter three digits");
        int a = java.nextInt();
        int b = java.nextInt();
        int c = java.nextInt();

        if(a>b)
        {
            if(a>c)
            {
                System.out.printf("%d is greater than all 3 digits" , a);
            }
            else
            {
                System.out.printf("%d is greater than all 3 digits" , c);
            }
        }
        else
        {
            if(b>c)
            {
                System.out.printf("%d is greater than all 3 digits" , b);
            }
            else
            {
                System.out.printf("%d is greater than all 3 digits" , c);
            }
        }
        java.close();
    }
}
