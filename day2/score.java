package day2;
import java.util.Scanner;
public class score {
    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the score");
        int mark = java.nextInt();
        if(mark>90)
        {
            System.out.println("You got O");
        }
        else if((mark>80) && (mark<=90))
        {
            System.out.println("You got E");
        }
        else if((mark>70)&&(mark<=80))
        {
            System.out.println("You got A");
        }
        else if((mark>60) && (mark<=70))
        {
            System.out.println("You got B");
        }
        else if((mark>50)&&(mark<=60))
        {
            System.out.println("You got C");
        }
        else
        {
            System.out.println("You failed");
        }
        java.close();
    }
}
