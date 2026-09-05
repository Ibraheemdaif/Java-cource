import java.util.concurrent.atomic.AtomicInteger;

public class Student {
//    int count = 0;
    private final AtomicInteger count = new AtomicInteger(0);

    public Student() {}
    public void incrementCount () {
        count.incrementAndGet();
    }

    public int getCount() {
        return count.get();
    }

}
