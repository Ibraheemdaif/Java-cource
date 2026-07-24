import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        int number = read.nextInt();

        Primes prime = new Primes(number);
        System.out.println(prime.getMessage());
        
    }
}
