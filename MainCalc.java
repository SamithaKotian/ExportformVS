public class MainCalc {
    public static void main(String args[]) {
        Calculator c = new Calculator();
        int r1 = c.add(8, 3);
        int r2 = c.sub(10, 7);
        System.out.println(r1 + "     " + r2);
    }
}