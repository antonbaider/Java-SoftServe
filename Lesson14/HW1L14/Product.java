import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Product {
    String manufactureCategory;
    LocalDate dateOfManufacture;
    double price;

    public Product(String manufactureCategory, LocalDate dateOfManufacture, double price) {
        this.manufactureCategory = manufactureCategory;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public void setManufactureCategory(String manufactureCategory) {
        this.manufactureCategory = manufactureCategory;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    @Override
    public String toString() {
        return "Product{" +
                "manufactureCategory='" + manufactureCategory + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", price=" + price +
                '}';
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Objects.equals(manufactureCategory, product.manufactureCategory) && Objects.equals(dateOfManufacture, product.dateOfManufacture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufactureCategory, dateOfManufacture, price);
    }

    public static void main(String[] args) {
        static Optional<String> mostPopularName(Stream< Employee> employees) {
            return null;     }

        List<Product> filteredAndSorted = products.stream()
                .filter(p -> p.getManufactureCategory().equals("Phone") && p.getPrice() > 3000 && p.getDateOfManufacture().getYear() < currentDate.getYear() - 1)
                .sorted(Comparator.comparingDouble(Product::getPrice).reversed())
                .collect(Collectors.toList());

        System.out.println("We have such list of products:"+ products);
        System.out.println("\nThan we filtered them by category 'Phones' with price > 3000 and date of manufacture more then 1 year ago:\n");
        for (Product filteredProduct : filteredAndSorted) {
            System.out.println(filteredProduct.getManufactureCategory() + ": $" + filteredProduct.getPrice() + ", with date: " + filteredProduct.getDateOfManufacture());
        }

    }
}
