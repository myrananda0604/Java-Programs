import java.io.*;

class FileDemo {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("test.txt");
        fw.write("Hello File");
        fw.close();

        FileReader fr = new FileReader("test.txt");
        int i;
        while ((i = fr.read()) != -1)
            System.out.print((char)i);

        fr.close();
    }
}