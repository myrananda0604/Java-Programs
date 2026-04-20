interface A {
    void show();
}

abstract class B {
    abstract void display();
}

class C extends B implements A {
    public void show() {
        System.out.println("Interface method");
    }

    void display() {
        System.out.println("Abstract method");
    }
}

class InheritanceDemo {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.display();
    }
}