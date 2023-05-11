import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class GetConfig {
    public static void main(String[] args) {
        Properties prop = new Properties();
        FileInputStream input = null;
        try {
            input = new FileInputStream("Config");

            // Load the properties from the file system
            prop.load(input);

            // Get the property values
            String username = prop.getProperty("username");
            String password = prop.getProperty("password");

            if (credentialChecker(username, password)) {
                System.out.println("Welcome " + username + "!");
            } else {
                System.out.println("You have failed to log in!");
            }

        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static boolean credentialChecker(String username, String password) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Username To Continue: ");
        String usernameInput = sc.nextLine();
        System.out.println("Please Enter Your Password To Continue: ");
        String passwordInput = sc.nextLine();

        while(!usernameInput.equals(username)) {
            System.out.println("Wrong Username, Please Try Again To Continue: ");
            usernameInput = sc.nextLine();
        }
        while(!passwordInput.equals(password)) {
            System.out.println("Wrong Password, Please Try Again To Continue: ");
            passwordInput = sc.nextLine();
        }

        return true;
    }
}
