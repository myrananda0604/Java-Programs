import java.util.Scanner;

class MatrixOps {
    int a[][] = new int[2][2];
    int b[][] = new int[2][2];

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of Matrix A:");
        for (int i=0;i<2;i++)
            for (int j=0;j<2;j++)
                a[i][j]=sc.nextInt();

        System.out.println("Enter elements of Matrix B:");
        for (int i=0;i<2;i++)
            for (int j=0;j<2;j++)
                b[i][j]=sc.nextInt();
    }

    void addition() {
        System.out.println("Addition:");
        for (int i=0;i<2;i++) {
            for (int j=0;j<2;j++) {
                System.out.print((a[i][j]+b[i][j])+" ");
            }
            System.out.println();
        }
    }

    void transpose() {
        System.out.println("Transpose of A:");
        for (int i=0;i<2;i++) {
            for (int j=0;j<2;j++) {
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }

    void sumRows() {
        for (int i=0;i<2;i++) {
            int sum=0;
            for (int j=0;j<2;j++) sum+=a[i][j];
            System.out.println("Row "+i+" sum="+sum);
        }
    }

    void sumCols() {
        for (int i=0;i<2;i++) {
            int sum=0;
            for (int j=0;j<2;j++) sum+=a[j][i];
            System.out.println("Col "+i+" sum="+sum);
        }
    }

    void diagonalSum() {
        int sum=0;
        for (int i=0;i<2;i++)
            sum+=a[i][i];
        System.out.println("Diagonal sum="+sum);
    }

    public static void main(String[] args) {
        MatrixOps obj=new MatrixOps();
        obj.input();
        obj.addition();
        obj.transpose();
        obj.sumRows();
        obj.sumCols();
        obj.diagonalSum();
    }
}