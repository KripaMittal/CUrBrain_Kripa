import java.util.*;
class pop
{
    static int most(int sales[])
    {
        int maxfreq = 0;
        int result = Integer.MAX_VALUE;
        for(int i = 0; i < sales.length; i++)
        {
            int count = 0;
            for(int j = 0; j < sales.length; j++)
            {
                if(sales[i] == sales[j])
                {
                    count++;
                }
            }
            if(count > maxfreq)
            {
                maxfreq = count;
                result = sales[i];
            }
            else if(count == maxfreq && sales[i] < result)
            {
                result = sales[i];
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
        System.out.println("Enter product IDs:");
        for(int i = 0; i < n; i++)
        {
            sales[i] = sc.nextInt();
        }
        int result = most(sales);
        System.out.println("Most Popular Item: " + result);
        sc.close();
    }
}