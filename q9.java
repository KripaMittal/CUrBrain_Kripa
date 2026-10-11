import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=n+1;
        while(true){
            boolean prime=true;
            if(num<2){
                prime=false;
            }
            for(int i=2;i<num;i++){
                if(num%i==0){
                    prime=false;
                    break;
                }
            }
            if(prime){
                System.out.println(num);
                break;
            }
            num++;
        }
    }
}

