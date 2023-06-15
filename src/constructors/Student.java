package constructors;

public class Student {
    public String name;
    int age;
    double psp;
    String batchName;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    Student(String name, int age, double psp, String batchName){
        this.name = name;
        this.age = age;
        this.psp = psp;
        this.batchName = batchName;
    }

    Student(Student student){
        this.name = student.name;
        this.age = student.age;
        this.psp = student.psp;
        this.batchName = student.batchName;
    }

    public Student(){}


}
