import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner read = new Scanner(System.in);
        int coutner = read.nextInt();
        Triangle triangle = new Triangle(coutner);
        triangle.drawTriangle();

        
        read.close();

    }
}
