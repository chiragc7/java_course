
import java.util.Scanner;
public class percentage{
    public static void main(String[] args)
    {
        System.out.println("percentage calculation ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int hindi = sc.nextInt();
        int english = sc.nextInt();
        int maths = sc.nextInt();
       // int total = hindi + english + maths ;
        int percentage = (hindi + english + maths) * 100 / 300 ;
        System.out.println("percentage is " + percentage + "%");


    }
}