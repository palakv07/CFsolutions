import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
 
            HashMap<Long, Long> map = new HashMap<>();
            map.put(0L, 1L);
 
            long sum = 0;
            long ans = 0;
 
            for (int i = 1; i <= n; i++) {
                sum += s.charAt(i - 1) - '0';
 
                long key = sum - i;
 
                ans += map.getOrDefault(key, 0L);
 
                map.put(key, map.getOrDefault(key, 0L) + 1);
            }
 
            System.out.println(ans);
        }
    }
}