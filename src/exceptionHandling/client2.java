package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class client2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
//            int c = a/b;
//            System.out.println(c);

        }
//        catch (NullPointerException nullPointerException){
//            System.out.println("nullPointerException");
//        }
//        catch (InputMismatchException exception){
//            System.out.println("InputMismatchException");
//        }
//        catch (ArithmeticException exception){
//            System.out.println(exception);
//        }
//        catch (Exception exception){
//            System.out.println("General Exception");
//        }
        finally {
            System.out.println("Always execute");
        }
    }
}
