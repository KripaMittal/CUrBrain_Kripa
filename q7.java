import java.util.*;
public class gcd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int ans=a[0];
        for(int i=1;i<n;i++){
            int b=a[i];
            while(b!=0){
                int r=ans%b;
                ans=b;
                b=r;
            }
        }
        System.out.println(ans);
    }
}
