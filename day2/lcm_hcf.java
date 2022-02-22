package day2;
import java.util.Scanner;

public class lcm_hcf
{
   public static void main(String[] args)
   {
      int c;
      Scanner java = new Scanner(System.in);
      
      System.out.print("Enter the Two Numbers: ");
      int a = java.nextInt();
      int b = java.nextInt();
      
      int num1 = a;
      int num2 = b;
      
      while(b!=0)
      {
         c = b;
         b = a%b;
         a = c;
      }
      
      int hcf = a;
      int lcm = (num1*num2)/hcf;
      
      System.out.println("\nHCF(" +num1+ ", " +num2+ ") = " +hcf);
      System.out.println("LCM(" +num1+ ", " +num2+ ") = " +lcm);
      java.close();
   }
}