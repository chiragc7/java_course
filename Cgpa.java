import java.util.Scanner;
public class Cgpa{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int per = (a+b+c)*100/300;
        System.out.println( "percentage is : "+ per +"%");
        double cgpa = per/9.5;
        System.out.println("CGPA is : "+ cgpa);

    }
}