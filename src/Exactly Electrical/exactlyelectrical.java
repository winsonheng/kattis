public class exactlyelectrical {
    public static void main(String[] args) {
        Kattio k = new Kattio(System.in);
        int x1 = k.getInt(), y1 = k.getInt(), x2 = k.getInt(), y2 = k.getInt(), t = k.getInt();
        int offset = Math.abs(x2 - x1) + Math.abs(y2 - y1) - t;
        
        k.println(offset <= 0 && offset % 2 == 0 ? "Y" : "N");
        
        k.close();
    }
}
