class humanbeing {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setName(String n) {
        name = n;
    }
}

public class Human {
    public static void main(String args[]) {
        humanbeing h = new humanbeing();
        h.setAge(10);
        h.setName("Samitha Kotian");
        System.out.println("Age:" + h.getAge() + "\nName:" + h.getName());

    }

}
