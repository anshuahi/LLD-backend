package constructors;

public class Client {
    public static void main(String[] args) {
        Student student = new Student("Adam", 24, 80.1, "Aug22");
        Student student1 = new Student();
        Student student2 = new Student("ANshu", 25);

        student2.batchName = "Sept23";
        student2.psp = 90.22;

        Student student3 = new Student(student2);

        student3.batchName = "Ahirwar";
        System.out.println("Debug");
    }
}
