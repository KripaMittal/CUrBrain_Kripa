import java.util.*;
class high
{
    static int sec(int scores[])
    {
        int highest = 0;
        int second = 0;
        boolean ff = false;
        boolean sf = false;
        for(int i = 0; i < scores.length; i++)
        {
            if(!ff || scores[i] > highest)
            {
                if(ff)
                {
                    second = highest;
                    sf = true;
                }
                highest = scores[i];
                ff = true;
            }
            else if(scores[i] != highest)
            {
                if(!sf || scores[i] > second)
                {
                    second = scores[i];
                    sf = true;
                }
            }
        }
        if(sf)
        {
            return second;
        }
        else
        {
            return -1;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int scores[] = new int[n];
        System.out.println("Enter scores:");
        for(int i = 0; i < n; i++)
        {
            scores[i] = sc.nextInt();
        }
        int result = sec(scores);
        System.out.println("Second Highest Score: " + result);
        sc.close();
    }
}