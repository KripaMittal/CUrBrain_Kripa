import java.util.*;
public class ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        ArrayList<Integer> digits = new ArrayList<>();
        if(num<0)
        {
            System.out.println("not allowed");
        }
        else
        {
            while(num != 0)
        {
            int digit = num % 10;
            if(digit % 2 == 0)
            {
                digits.add(0, 0);
            }
            else
            {
                digits.add(0, digit);
            }
            num /= 10;
        }
        System.out.println("Final list = " + digits);
        }
        sc.close();
    }
} 

