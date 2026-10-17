import java.util.*;
class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long MOD = 1000000007;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum = (sum + arr[i]) % MOD;
        }
        System.out.println(sum);
        sc.close();
    }
}

