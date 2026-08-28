import java.util.Objects;

public class Car {
    String plateNumber;
    String color;

    public Car() {}

    public Car(String plateNumber , String color) {
        this.plateNumber = plateNumber;
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (getClass() != obj.getClass() || obj == null)
            return false;
        Car car = (Car) obj;
        return this.plateNumber == car.plateNumber && this.color == car.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(plateNumber,color);
    }
}
