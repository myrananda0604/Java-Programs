class A extends Thread {
    public void run() {
        for (int i=1;i<=100;i++)
            System.out.println("A: "+i);
    }
}

class B extends Thread {
    public void run() {
        for (int i=1;i<=100;i++)
            System.out.println("B: "+i);
    }
}

class C extends Thread {
    public void run() {
        for (int i=1;i<=100;i++)
            System.out.println("C: "+i);
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        new A().start();
        new B().start();
        new C().start();
    }
}