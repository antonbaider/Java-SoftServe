package Product;
import static Product.Main.SCANNER;
public class Product {
    String name;
    double price;
    int quantity;
    static int maxQuantity;
    static int maxPrice;
    public Product() {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }
    public static int getmaxQuantity(Product num1, Product num2, Product num3, Product num4) {
        maxQuantity = num1.quantity;
        if (num2.quantity > maxQuantity) maxQuantity = num2.quantity;
        if (num3.quantity > maxQuantity) maxQuantity = num3.quantity;
        if (num4.quantity > maxQuantity) maxQuantity = num4.quantity;
        System.out.println("Max Quantity = " + maxQuantity);
        return maxQuantity;
    }
    public static int getmaxPrice(Product num1, Product num2, Product num3, Product num4) {
        maxPrice = (int) num1.price;
        if (num2.price > maxPrice) maxPrice = (int) num2.price;
        if (num3.price > maxPrice) maxPrice = (int) num3.price;
        if (num4.price > maxPrice) maxPrice = (int) num4.price;
        System.out.println("Max Price = " + maxPrice);
        return maxPrice;
    }


    public String getName() {
        return name;
    }
    public static void printProductStats() {
        //  System.out.println("maxQuantity = " + Product.getmaxQuantity());
        // System.out.println("AVR rating = %.2f".formatted(Student.avrRating()));
    }
    public static void getPrintIn (Product product){
        System.out.print("Input the name: ");
        String name = SCANNER.nextLine();
        product.setName(name);
        System.out.print("Enter the price for " + product.getName() + ": ");
        double price = SCANNER.nextInt();
        product.setPrice(price);
        System.out.print("Enter the quantity for " + product.getName() + ": ");
        int quantity = SCANNER.nextInt();
        product.setQuantity(quantity);
        SCANNER.nextLine();
    }

    //  public boolean maxQuantity(Product other) {
    //      return quantity > other.quantity;
    //  }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }


    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}