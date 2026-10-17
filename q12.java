import java.util.*;
class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long base = sc.nextLong();
        int power = sc.nextInt();
        long MOD = sc.nextLong();
        long result = 1 % MOD;
        for (int i = 0; i < power; i++) {
            result = (result * base) % MOD;
        }
        System.out.println(result);
        sc.close();
    }
}
