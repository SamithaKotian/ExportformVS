class CalcA {
    public void display() {
        System.out.println("calA");
        // return n1 + n2;
    }
}

class CalcAB extends CalcA {
    public void display() {
        // return n1 + n2 + 6;
        System.out.println("calAB");
    }
}

public class MethodOverloadingEg {
    public static void main(String args[]) {
        CalcAB obj = new CalcAB();
        obj.display();
        // int r1 = obj.add(2, 1);
        // System.out.println(r1);
    }
}
