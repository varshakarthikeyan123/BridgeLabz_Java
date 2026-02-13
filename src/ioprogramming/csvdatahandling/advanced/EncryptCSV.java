package ioprogramming.csvdatahandling.advanced;

import java.util.Base64;

public class EncryptCSV {

    public static String encrypt(String value) {
        return Base64.getEncoder().encodeToString(value.getBytes());
    }

    public static String decrypt(String value) {
        return new String(Base64.getDecoder().decode(value));
    }

    public static void main(String[] args) {

        String salary = "50000";

        String encrypted = encrypt(salary);
        System.out.println("Encrypted: " + encrypted);

        System.out.println("Decrypted: " + decrypt(encrypted));
    }
}
