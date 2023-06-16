package methodOverriding;

public class Client {
    public static void main(String[] args) {
        A a = new A();
        a.doSomething("Anshu");

        a = new B();
        a.doSomething("Anshu");

        B b = new B();
        b.doSomething("Anshu");

//        b = new A();
//        b.doSomething("Anshu");
    }
}
