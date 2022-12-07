public class apaxiaaans {
    public static void main(String[] args) {
        Kattio k = new Kattio(System.in);
        char recent = '.';
        StringBuilder res = new StringBuilder();
        String input = k.getWord();

        for (int i = 0; i < input.length(); ++i) {
            char c = input.charAt(i);
            if (recent != c) {
                recent = c;
                res.append(c);
            }
        }

        k.println(res.toString());
        k.close();
    }
}
