public class shatteredcake {
    public static void main(String[] args) {
        Kattio k = new Kattio(System.in);
        int w = k.getInt(), n = k.getInt();
        int sum = 0;

        for (; n > 0; --n) {
            sum += k.getInt() * k.getInt();
        }

        k.println(sum / w);
        k.close();
    }
}
