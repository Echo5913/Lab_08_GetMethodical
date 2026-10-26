
import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Test Part A
        String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("Name: " + name);

        // Test Part B
        int age = SafeInput.getInt(in, "Enter an integer");
        System.out.println("Integer: " + age);

        // Test Part C
        double decimal = SafeInput.getDouble(in, "Enter a decimal");
        System.out.println("Decimal: " + decimal);

        // Test Part D
        int number = SafeInput.getRangedInt(in, "Enter a number", 1, 10);
        System.out.println("Number: " + number);

        // Test Part E
        double price = SafeInput.getRangedDouble(in, "Enter a price", 0.50, 10.00);
        System.out.println("Price: " + price);

        // Test Part F
        boolean answer = SafeInput.getYNConfirm(in, "Do you like Java");
        System.out.println("Answer: " + answer);

        // Test Part G
        String zip = SafeInput.getRegExString(in, "Enter a 5-digit ZIP code", "^\\d{5}$");
        System.out.println("ZIP code: " + zip);

        // Test the header
        SafeInput.prettyHeader("Hello World");
    }
}
