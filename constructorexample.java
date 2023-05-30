class Human1 {
    int age;
    String name;

    public Human1(int age, String name) {
        this.age = age;
        this.name = name;
    }

}

class constructorexample {
    public static void main(String args[]) {
        Human1 obj = new Human1(30, "Samitha Kotian");
        System.out.println(obj.age + "    " + obj.name);
    }

}