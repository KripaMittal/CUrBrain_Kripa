import java.util.*;
public class ques2 {
    static int reverse_and_double(int n)
    {
        int rev = 0;
        int digit;
        while(n != 0)
        {
            digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return rev * 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int result = reverse_and_double(num);
        System.out.println("Double of the reversed number is " + result);
        sc.close();
    }
}
