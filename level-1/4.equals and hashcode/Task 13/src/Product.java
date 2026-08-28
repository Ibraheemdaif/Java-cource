import java.util.Objects;

public class Product {
    String code;
    double price;

    public Product() {}

    public Product(String code , double price) {
        this.code = code;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (getClass() != obj.getClass() || obj == null)
            return false;
        Product product = (Product) obj;
        return this.code == product.code;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(code);
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", price=" + price +
                '}';
    }
}
