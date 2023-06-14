package oops1;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
//        Student st = new Student("Jeet ray", 9453824095);
//        ans.name = "Anshu";
//        ans.age = 25;
//        ans.psp = 90.1;
//        ans.batchName = "Sept22 Adv";

//        System.out.println(st);
            Scanner sc = new Scanner(System.in);

        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x/y);
        }
        catch (ArithmeticException ex){
            System.out.println(ex);
        }
        finally {
            System.out.println("Final");
        }
    }
}
