
import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(in,
                "Enter SSN (###-##-####)",
                "^\\d{3}-\\d{2}-\\d{4}$");

        String studentID = SafeInput.getRegExString(in,
                "Enter UC Student M number",
                "^(M|m)\\d{5}$");

        String menu = SafeInput.getRegExString(in,
                "Choose Open, Save, View, or Quit (O/S/V/Q)",
                "^[OoSsVvQq]$");

        System.out.println("\nSSN: " + ssn);
        System.out.println("Student ID: " + studentID);
        System.out.println("Menu choice: " + menu);
    }
}

