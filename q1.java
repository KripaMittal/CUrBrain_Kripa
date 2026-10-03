import java.util.*;
public class ques1 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int count = 0;
        int originalNum = num;
        while(num!=0){
            count++;
            num /= 10;
        }
        if(count % 2 == 0){
            if(originalNum < 0)
            {
                System.out.println("True");
                System.out.println("The minus is not a digit," + originalNum + " has " + count + " even number of digits");
            }
            else
            {
                if(originalNum == 0)
                {
                    System.out.println("False");
                    System.out.println("0 has 1 digit");
                }
                else{
                    System.out.println("True");
                    System.out.println(originalNum + " has " + count + " digits");
                }
            }
        } else {
            System.out.println("False");
            System.out.println(originalNum + " has " + count + "digits");
        }
        sc.close();
    }
}