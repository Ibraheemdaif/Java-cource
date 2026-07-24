public class Pum {
    private int pumKey;

    public Pum(int key) {
        setKey(key);
    }

    public void setKey(int key) {
        if (key >= 1 && key <= 20) {
            this.pumKey = key;
        }
    }

    public void showResult() {
        int start = 1;
        for(int i = 0; i < pumKey; i++) { 
            for(int j = 0; j < 3; j++) {
                System.out.print(start + " ");
                start++;
            }
            start ++;
            System.out.println("PUM");
        }

}
}
