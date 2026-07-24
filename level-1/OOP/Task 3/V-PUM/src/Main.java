import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner read = new Scanner(System.in);
        int pumCount = read.nextInt();

        Pum pum = new Pum(pumCount);
        pum.showResult();

        read.close();
    }
}
