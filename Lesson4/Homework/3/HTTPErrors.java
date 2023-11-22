import java.util.Scanner;

public class HTTPErrors {
    public static void main(String[] args) {
        System.out.println("Enter an HTTP error code:");
        Scanner scanner = new Scanner(System.in);
        int errorCode = scanner.nextInt();
        HTTPError httpError = HTTPError.getByCode(errorCode);
        System.out.println("Error Name: " + httpError.getName());
    }

    public enum HTTPError {
        BAD_REQUEST(400, "Bad Request"), UNAUTHORIZED(401, "Unauthorized"), PAYMENT_REQUIRED(402, "Payment Required"),
        UNKNOWN_ERROR(-1, "Unknown Error");
        private final int code;
        private final String name;

        HTTPError(int code, String name) {
            this.code = code;
            this.name = name;
        }

        public static HTTPError getByCode(int code) {
            for (HTTPError error : HTTPError.values()) {
                if (Integer.valueOf(code).equals(error.getCode())) {
                    return error;
                }
            }
            return UNKNOWN_ERROR;
        }

        public int getCode() {
            return code;
        }

        public String getName() {
            return name;
        }
    }
}
