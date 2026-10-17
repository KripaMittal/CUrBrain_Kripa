import java.util.*;
class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int sum = 0;
        boolean found = false;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            if (sum % k == 0) {
                found = true;
                break;
            }
        }
        System.out.println(found);
        sc.close();
    }
}
