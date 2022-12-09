public class sumkindofproblem {
    public static void main(String[] args) {
        Kattio k = new Kattio(System.in);
        int p = k.getInt();

        for (; p > 0; --p) {
            k.print(k.getInt() + " ");
            int n = k.getInt();
            k.println(((n + 1) * n >> 1) + " " + (n * n) + " " + ((n + 1) * n));
        }

        k.close();
    }
}
