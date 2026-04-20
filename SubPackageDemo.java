class B {
    public void display() {
        System.out.println("This simulates a class inside a subpackage");
    }
}

class SubPackageDemo {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}