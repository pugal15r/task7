package handle;

public class listofarray {
    public static void main(String[] args) {
        // Initialize a string
        String text = "welcome, World!";

        try {
            // Attempt to access a character at an index that is out of bounds
            char ch = text.charAt(20);
            System.out.println("Character at index 20: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            // Handle the exception
            System.out.println("Error: String index is out of bounds.");
        }
    }
}
