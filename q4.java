import java.util.*;
public class ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int product = 1;
        int sum = 0;
        int digit;
        while(num != 0)
        {
            digit = num % 10;
            sum = sum + digit;
            product = product * digit;
            num /= 10;
        }
        int result = product - sum;
        System.out.println("Difference = " + result);
        sc.close();
    }
}
