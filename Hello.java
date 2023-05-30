import javax.print.DocFlavor.STRING;

class Hello {
    public static void main(String a[]) {

        int num[][][] = { { { 75, 87, 69 }, { 56, 57, 58 }, { 67, 67, 69 } },
                { { 56, 76, 98 }, { 67, 98, 90 }, { 76, 98, 75 } } };
        String Dept[] = { "Computer Science", "Electrical" };
        for (String m : Dept) {

            for (int i = 0; i < 2; i++) {
                System.out.println(m);
                int j;
                for (j = 0; j < 3; j++) {
                    System.out.print("Student " + (j + 1) + " Score: ");
                    int k, total = 0;
                    for (k = 0; k < 3; k++) {

                        System.out.print(num[i][j][k] + " ");
                        total += num[i][j][k];

                    }
                    System.out.println();
                    System.out.println("Total Score:" + total);

                }
                System.out.println();
            }

        }
        // int num[][] = new int[3][];
        // num[0] = new int[2];
        // num[1] = new int[3];
        // num[2] = new int[4];
        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < num[i].length; j++) {
        // num[i][j] = (int) (Math.random() * 10);
        // }
        // }
        // for (int i[] : num) {
        // for (int j : i) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }
    }

    // calculator cacl = new calculator();
    // int c = 10;
    // int b = 70;
    // int e = 30;
    // int result = cacl.add(c, b);
    // int result1 = cacl.sub(result, e);
    // System.out.println(result);
    // System.out.println(result1);

    // switch (n) {
    // case 1:
    // System.out.println("Monday");
    // break;
    // case 2:
    // System.out.println("Tuesday");
    // case 3:
    // System.out.println("Wednesday");
    // case 4:
    // System.out.println("Thursday");
    // case 5:
    // System.out.println("Friday");
    // case 6:
    // System.out.println("Saturday");
    // break;
    // default:
    // System.out.println("enter valid number");
    // for (n = 0; n < 5; n++) {
    // do {
    // System.out.println("Hiii");
    // int j = 1;
    // while (j < 3) {
    // System.out.println("Hello");
    // j++;
    // }
    // n++;
    // } while (n < 5);

    // }
    // int i = 1;
    // for (i = 1; i <= 7; i++) {
    // System.out.println("day " + i);
    // for (int j = 1; j < 9; j++) {
    // System.out.println(" " + (j + 8) + "-" + (j + 9));
    // }
    // }

}
// }

// class calculator {
// public int add(int a, int b) {
// return a + b;
// }

// public int sub(int a, int b) {
// return a - b;
// }
// }