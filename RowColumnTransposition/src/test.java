public class test {
    public static void main(String[] args) {

        String encryptedString;
        String decryptedString;

        encryptedString = RowColumnTransposition.encrypt("this is a secret message!", 5);

        System.out.println("Encrypted String - " + encryptedString);

        decryptedString = RowColumnTransposition.decrypt(encryptedString, 4);

        System.out.println("Decrypted String - " + decryptedString);
    }
}
