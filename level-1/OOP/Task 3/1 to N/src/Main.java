import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner read = new Scanner(System.in);

        short num = read.nextShort();

        Num number = new Num(num);
        number.showResult();

        read.close();
    }
}
