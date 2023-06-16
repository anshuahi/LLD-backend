package introToThreads;

public class Client {

    public static void doSomething(){
        System.out.println("Doing something: printed by " + Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        System.out.println("Hello threads: printed by " + Thread.currentThread().getName());

        HelloWorldPrinter printer = new HelloWorldPrinter();
        Thread thread = new Thread(printer);    // Passing the task which it will run
        thread.start();

        Thread thread1 = new Thread(printer);    // Passing the task which it will run
        thread1.start();



        doSomething();
    }
}

// Q: Print Hello World in a different thread.
// 1. Identify all the tasks -> Print Hello World.
// 2. Create a class for each task.
// 3. Make this class implement Runnable interface.
// 4. Implement run() method -> Write the code in the run() method, that you want to execute in different thread.
// 5. Create a thread Object from where you want to run the task in a different thread, and pass the object of the task to it.
// 6. Start the thread.