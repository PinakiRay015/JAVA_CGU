package day1;


import java.util.Scanner;
class gross
{
    public static void main(String args[])
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the value of basic salary, da of basic salary and hra of basic salary");
        int basicsalary = java.nextInt();
        double hra = basicsalary * 0.2;
        double da = basicsalary * 0.4;

        double GS = basicsalary + hra + da;
        System.out.println("The Gross salary is "+GS);
        java.close();
    }
}