public class fizzbuzz {
    public static void main(String[] args) {

        Kattio k = new Kattio(System.in);
        int x = k.getInt(), y = k.getInt(), n = k.getInt();

        for (int i = 1; i <= n; ++i) {
            if (i % x == 0) {
                if (i % y == 0) {
                    k.println("FizzBuzz");
                } else {
                    k.println("Fizz");
                }
            } else if (i % y == 0) {
                k.println("Buzz");
            } else {
                k.println(i);
            }
        }

        k.close();
        
    }
}
