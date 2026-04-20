class ExceptionDemo {
    public static void main(String[] args) {
        int arr[] = new int[5];

        try {
            arr[10] = 50;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Error");
        }

        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero error");
        }
    }
}