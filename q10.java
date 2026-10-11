import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean a[]=new boolean[n];
        for(int i=2;i<n;i++){
            a[i]=true;
        }
        for(int i=2;i<n;i++){
            if(a[i]){
                for(int j=i*2;j<n;j+=i){
                    a[j]=false;
                }
            }
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(a[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}

