import java.util.Scanner; // Import Scanner class for user input

public class PasswordVerifier {
    


    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Define the correct password
        String correctPassword = "BaneleMdhluli#";

        //  Infinite Loop until the entered password matches the correct one
        while (true) {
            System.out.print("Enter password: ");
            String enteredPassword = input.nextLine();

            if (enteredPassword.equals(correctPassword)) {
                System.out.println("✅ Access granted!");
                break; // Exit the loop when password is correct
            } else {
                System.out.println("❌ Wrong password. Try again.");
            }
        }
    }
}