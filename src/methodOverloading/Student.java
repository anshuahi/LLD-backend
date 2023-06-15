package methodOverloading;

public class Student {
    String name;
    int age;

    void hello(){
        System.out.println("Hello");
    }

    void hello(String name){
        System.out.println("Hello " + name);
    }

//    String hello(String name){
//        System.out.println("Hello " + name);
//        return name;
//    }

    void hello(Object ob){
        System.out.println("Hello object");
    }

}
