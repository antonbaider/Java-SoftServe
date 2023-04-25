
/** Client error responses
 400 Bad Request

 401 Unauthorized

 402 Payment Required Experimental

 403 Forbidden

 404 Not Found
 **/
import java.util.Scanner;
import static java.lang.Integer.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter HTTP error (400 - 404): ");
        int error = parseInt(scanner.nextLine());
        scanner.close();
        String result;
        switch (error)
        {
            case 400:
                result = "Error means Bad Request";
                break;
            case 401:
                result = "Error means Unauthorized";
                break;
            case 402:
                result = "Error means Payment Required Experimental";
                break;
            case 403:
                result = "Error means Forbidden";
                break;
            case 404:
                result = "Error means Not Found";
                break;
            default:
                result = "Wrong! Choose only 400 - 404";
        }
        System.out.println(result);
    }
}