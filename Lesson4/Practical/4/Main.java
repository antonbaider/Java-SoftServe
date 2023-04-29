package Product;
import java.util.Scanner;
public class Main {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] arg) {
        Product num1;
        num1 = new Product();
        Product.getPrintIn(num1);
        Product num2;
        num2 = new Product();
        Product.getPrintIn(num2);
        Product num3;
        num3 = new Product();
        Product.getPrintIn(num3);
        Product num4;
        num4 = new Product();
        Product.getPrintIn(num4);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        // Product.printProductStats();
        Product.getmaxQuantity(num1,num2,num3,num4);
        Product.getmaxPrice(num1,num2,num3,num4);
    }

}