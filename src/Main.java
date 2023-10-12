import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        int key = scanner.nextInt();

        String encryptedMessage = encryptMessage(message, key);
        System.out.println(encryptedMessage);
        scanner.close();
    }
    public static String encryptMessage(String message, int key) {
        StringBuilder encryptedMessage = new StringBuilder();

        for (char c : message.toCharArray()) {
            if (Character.isLowerCase(c)) {
                char encryptedChar = (char) (((c - 'a' + key) % 26) + 'a');
                encryptedMessage.append(encryptedChar);
            } else if (Character.isUpperCase(c)) {
                char encryptedChar = (char) (((c - 'A' + key) % 26) + 'A');
                encryptedMessage.append(encryptedChar);
            } else {
                encryptedMessage.append(c);
            }
        }

        return encryptedMessage.toString();
    }
}