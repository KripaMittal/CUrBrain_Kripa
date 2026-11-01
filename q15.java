import java.util.*;
class min
{
    static int minabs(int arr[])
    {
        int min = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(Math.abs((long)arr[i]) < Math.abs((long)min))
            {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int result = minabs(arr);
        System.out.println("Minimum Absolute Value: " + result);
        sc.close();
    }
}