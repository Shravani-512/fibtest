import java.util.*;

public class SubstitutionCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String key =       "qwertyuiopasdfghjklzxcvbnm"; // substitution pattern

        System.out.print("Enter text: ");
        String text = sc.nextLine().toLowerCase();

        // Encrypt the text
        String encrypted = encrypt(text, alphabet, key);
        System.out.println("Encrypted text: " + encrypted);

        // Decrypt the text
        String decrypted = decrypt(encrypted, alphabet, key);
        System.out.println("Decrypted text: " + decrypted);

        sc.close();
    }

    public static String encrypt(String text, String alphabet, String key) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = alphabet.indexOf(c);
                result.append(key.charAt(index));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static String decrypt(String cipherText, String alphabet, String key) {
        StringBuilder result = new StringBuilder();
        for (char c : cipherText.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = key.indexOf(c);
                result.append(alphabet.charAt(index));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
