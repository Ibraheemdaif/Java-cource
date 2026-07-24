public class Primes {
    private int number;

    public Primes(int num) {
        setNumber(num);
    }
    public void setNumber(int num ) {
        if (num >= 2 && num <= 100000) {
            this.number = num;
        }
    }
    public boolean isPrime() {
        int i = 2;
        while (i < number) {
            if (number % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public String getMessage() {
        boolean checker = isPrime();
        if (!checker) {
            return "NO";
        }
        return "YES";
    }
}
