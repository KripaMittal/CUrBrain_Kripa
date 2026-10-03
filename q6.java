import java.util.*;
public class ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("Enter digit a: ");
        int a = sc.nextInt();
        System.out.print("Enter digit b: ");
        int b = sc.nextInt();
        if(num < 0 || a < 0 || a > 9 || b < 0 || b > 9)
        {
            System.out.println("Invalid input");
        }
        else
        {
            int countA = 0;
            int countB = 0;
            int digit;
            if(num == 0)
            {
                if(a == 0)
                {
                    countA++;
                }
                if(b == 0)
                {
                    countB++;
                }
            }
            else
            {
                while(num != 0)
                {
                    digit = num % 10;

                    if(digit == a)
                    {
                        countA++;
                    }

                    if(digit == b)
                    {
                        countB++;
                    }

                    num /= 10;
                }
            }
            int diff = countA - countB;
            if(diff < 0)
            {
                diff = -diff;
            }
            System.out.println("Frequency of " + a + " = " + countA);
            System.out.println("Frequency of " + b + " = " + countB);
            System.out.println("Absolute difference = " + diff);
        }
        sc.close();
    }
}
