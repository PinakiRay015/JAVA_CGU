package day2;
public class even_odd {
    public static void main(String[] args) {
        for(int i = 1;i<=100;i++)
        {
            if(i%2==0)
            {
                System.out.printf("%d is even\n" , i);
            }
            else
            {
                System.out.printf("%d is odd\n" , i);
            }
        }
    }
}
