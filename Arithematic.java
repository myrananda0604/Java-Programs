class Arithmetic {
    int a, b;

    Arithmetic(int x, int y) {
        a = x;
        b = y;
    }

    void add() {
        System.out.println("Addition = " + (a + b));
    }

    void sub() {
        System.out.println("Subtraction = " + (a - b));
    }

    void mul() {
        System.out.println("Multiplication = " + (a * b));
    }

    void div() {
        if (b != 0)
            System.out.println("Division = " + (a / b));
        else
            System.out.println("Division by zero not allowed");
    }

    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic(10, 5);
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
    }
}