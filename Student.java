class student1 {
    String name;
    int RollNo;
    int marks;

    public void display() {
        System.out.println("Student name:" + name + "\n Register No:" + RollNo + "\nMarks:" + marks);
    }
}

public class Student {
    public static void main(String args[]) {
        student1 s = new student1();
        s.name = "Shreya Kapoor";
        s.RollNo = 101;
        s.marks = 590;

        student1 s1 = new student1();
        s1.name = "Nidhi Kapoor";
        s1.RollNo = 102;
        s1.marks = 534;

        s.display();
        s1.display();
    }

}
