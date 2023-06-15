package methodOverriding;

public class B extends A{
    @Override
    void doSomething(String s) {
        System.out.println("call from B " + s);
    }
}
