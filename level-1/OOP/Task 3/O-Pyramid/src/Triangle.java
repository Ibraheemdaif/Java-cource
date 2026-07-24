
public class Triangle {

    private int counter;

    public Triangle(int counter) {
        setCounter(counter);
    }
    
    public void setCounter(int counter) {
        if (counter >= 1 && counter <= 99) {
            this.counter = counter;
        }
    }

    public void drawTriangle() {
        for (int i = 1; i <= counter; i++) {
            for(int j = 1; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}