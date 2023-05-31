// 1. Create two methods String encrypt(String s, int n) and String decrypt(Stirng s, int n)
//Method encrypt should take a string and return coded string where every letter
// is moved on n positions in alphabet (e.g. encrypt("abc", 3) returns "def“). Method decrypt should return decoded value
public class Crypted {

    public static void main(String[] args) {
        System.out.println("Every letter is moved on n positions in alphabet " +
                "(e.g. encrypt(\"abc\", 3) returns \"def“). Method decrypt should return decoded value");
        System.out.println("Encrypted: "+encrypt("abc", 3));
        System.out.println("Decrypted: "+decrypt("def", 3));
    }
    public static String encrypt(String s, int n){
        String m = "";
        int len = s.length();
        for(int x = 0; x < len; x++){
            char c = (char)(s.charAt(x) + n);
            if (c > 'z')
                m += (char)(s.charAt(x) - (26-n));
            else
                m += (char)(s.charAt(x) + n);
        }
        return m;
    }
    public static String decrypt(String s, int n){
        String m = "";
        int len = s.length();
        for(int x = 0; x < len; x++){
            char c = (char)(s.charAt(x) - n);
            if (c > 'z')
                m += (char)(s.charAt(x) + (26-n));
            else
                m += (char)(s.charAt(x) - n);
        }
        return m;
    }
}
