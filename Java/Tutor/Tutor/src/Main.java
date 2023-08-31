public class Main {
    public static void main(String[] args) throws Exception {
       double ans = 5, v1 = 2, v2 = 10, v3 = 18;
        ans += v1 + 10 * (--v2 / 5) + v3 / v2;
        System.out.println(ans);
        System.out.println(v2);
    }
}
