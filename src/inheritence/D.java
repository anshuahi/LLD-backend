package inheritence;

public class D extends C{
    D(){
        super("ANshu"); // super method should be called at first line of the constructor
        System.out.println("Constructor of D");
    }
}
