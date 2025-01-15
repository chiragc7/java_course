

import java.util.Scanner;
public class km_to_miles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to convert km to miles ");
        int num = sc.nextInt();
        double miles = num * 0.62137;
        System.out.println("kilometer value is : " + num );
        System.out.println("miles value is : "+ miles);

    }
}
