public class Num {
    private short num;

    public Num(short num) {
        setNum(num);
    }

    public void setNum(short num) {
        if (num >= 1 && num <= 1000) {
            this.num = num;
        }
    }

    public void showResult() {
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}
