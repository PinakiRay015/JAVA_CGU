//program to create a class student and initialize the member variables through dot operator or reference
package lab3;
import java.util.Scanner;
public class student {
    int id;
    String name;
public static void main(String[] args) {
    Scanner java = new Scanner(System.in);
    student st = new student();
    System.out.println("Enter the name of the student");
    st.name = java.nextLine();
    System.out.println("Enter the Roll no. of the student");
    st.id = java.nextInt();
    System.out.println("Name of the student is "+st.name);
    System.out.println("Name of the student is "+st.id);
    java.close();
}
}
