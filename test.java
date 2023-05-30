class mobile {
    String brand;
    int cost;
    static String name;

    public void display() {
        System.out.println("brand:  " + brand + "  \ncost:" + cost + "\nName:" + name);
    }
}

public class test {

    public static void main(String args[]) {
        // int a[] = { 3, 4, 5, 2 };
        // for (int i : a) {
        // System.out.print(i + " ");
        // }
        mobile m = new mobile();
        m.brand = "Iphone";
        m.cost = 1500;
        mobile.name = "phone";

        mobile m1 = new mobile();
        m1.brand = "Samsung";
        m1.cost = 1700;
        mobile.name = "phone";

        m.display();
        m1.display();

    }
}
