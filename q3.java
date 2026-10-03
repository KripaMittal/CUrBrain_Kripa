import java.util.*;
public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int rev = 0;
        int digit;
        while(num != 0)
        {
            digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        if(originalNum == rev)
        {
            System.out.println("The number is a palindrome");
            System.out.println("Result = " + originalNum);
        }
        else
        {
            int sum = originalNum + rev;
            System.out.println("The number is not a palindrome");
            System.out.println("Sum of the number and its reversed value = " + sum);
        }
        sc.close();
    }
}
