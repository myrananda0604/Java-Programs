import java.util.Scanner;

class ArrayOps {
    int arr[] = new int[5];

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void output() {
        System.out.print("Array: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void reverse() {
        System.out.print("Reversed: ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayOps obj = new ArrayOps();
        obj.input();
        obj.output();
        obj.reverse();
    }
}