import java.util.*;
class thresh
{
    static int[] thres(int sales[], int threshold)
    {
        int count = 0;
        for(int i = 0; i < sales.length; i++)
        {
            if(sales[i] >= threshold)
            {
                count++;
            }
        }
        int result[] = new int[count];
        int j = 0;
        for(int i = 0; i < sales.length; i++)
        {
            if(sales[i] >= threshold)
            {
                result[j] = sales[i];
                j++;
            }
        }
        return result;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int sales[] = new int[n];
        System.out.println("Enter sales elements:");
        for(int i = 0; i < n; i++)
        {
            sales[i] = sc.nextInt();
        }
        System.out.print("Enter threshold: ");
        int threshold = sc.nextInt();
        int result[] = thres(sales, threshold);
        System.out.print("Result: ");
        for(int i = 0; i < result.length; i++)
        {
            System.out.print(result[i] + " ");
        }
        sc.close();
    }
}