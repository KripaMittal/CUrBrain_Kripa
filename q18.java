import java.util.*;
class revv
{
    static void rev(int arr[], int start, int end)
    {
        while(star<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter start index: ");
        int start=sc.nextInt();
        System.out.print("Enter end index: ");
        int end=sc.nextInt();
        rev(arr,start,end);
        System.out.print("Reversed Array: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}