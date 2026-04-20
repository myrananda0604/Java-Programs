class A {
    public void show() {
        System.out.println("This simulates a package class");
    }
}

class PackageDemo {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
    }
}