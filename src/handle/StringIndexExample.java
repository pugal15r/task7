package handle;

public class StringIndexExample {
    public static void main(String[] args) {
        String str = "Hello";

        // Trying to access an index that does not exist
        try {
            var character = str.charAt(10); // String "WELCOME" has indices 0 to 4
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught!");
            e.printStackTrace();
        }
    }
}