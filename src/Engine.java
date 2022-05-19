/**
 *
 * @author Maksim Mishchenko
 */
public class Engine {
    public static  String eng(int a, int b, char ch) {
        if (a == 0 || b == 0) {
            throw new IllegalArgumentException();
        }

        if (String.valueOf(ch).contains("+")) return String.valueOf(a + b);
        else if (String.valueOf(ch).contains("-")) return String.valueOf(a - b);
        else if (String.valueOf(ch).contains("*")) return String.valueOf(a * b);
        else if (String.valueOf(ch).contains("/")) return String.valueOf(a / b) ;
        else throw new IllegalArgumentException();
    }

}
