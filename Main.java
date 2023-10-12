import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        String message = scanner.nextLine();
        int key = scanner.nextInt();
        if(key>3) {
            int a = sc.nextInt();
            System.out.println(encryptMessage(message, key, a));
        }
        else{
            System.out.println(encryptMessage(message, key));
        }
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
    public static String encryptMessage(String message, int key, int a) {
        StringBuilder encryptedMessage = new StringBuilder();

        for (char c : message.toCharArray()) {
            if (Character.isLowerCase(c)) {
                char encryptedChar = (char) (((c - 'a' + key+a) % 26) + 'a');
                encryptedMessage.append(encryptedChar);
            } else if (Character.isUpperCase(c)) {
                char encryptedChar = (char) (((c - 'A' + key+a) % 26) + 'A');
                encryptedMessage.append(encryptedChar);
            } else {
                encryptedMessage.append(c);
            }
        }
        return encryptedMessage.toString();
    }
}