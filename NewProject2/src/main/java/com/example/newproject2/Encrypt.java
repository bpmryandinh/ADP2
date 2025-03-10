package com.example.newproject2;


import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class Encrypt {
    //Initialize variables
    public static SecretKeySpec secretkey;
    public static byte[] key;
    String secret = "unsecuredp@ssasdfghjk";

    //Maxwell's security presentation
    public static void setKey(String myKey) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        MessageDigest sha = null;
        key = myKey.getBytes("UTF-8");
        sha = MessageDigest.getInstance("SHA-512");
        key = sha.digest(key);
        key = Arrays.copyOf(key, 16);
        secretkey = new SecretKeySpec(key, "AES");
    }

    public static String encrypt(String strToEncrypt, String secret) throws InvalidKeyException, UnsupportedEncodingException,
            NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
        setKey(secret);

        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secretkey);

        byte [] strToEncryptBytes = strToEncrypt.getBytes("UTF-8");
        byte [] finalCipher = cipher.doFinal(strToEncryptBytes);
        return Base64.getEncoder().encodeToString(finalCipher);
    }


    public static String decrypt(String strToDecrypt, String secret) throws UnsupportedEncodingException, NoSuchAlgorithmException,
            NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        setKey(secret);

        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, secretkey);
        byte [] finalByteString = Base64.getDecoder().decode(strToDecrypt);
        return new String(cipher.doFinal(finalByteString));
    }

    public static String getSalt() throws NoSuchAlgorithmException {
        SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        return Base64.getEncoder().encodeToString(salt);
    }

    public static String hashPassword(String passwordToHash, String saltString) throws NoSuchAlgorithmException {
        String generatedPassword = null;
        byte[] salt = Base64.getDecoder().decode(saltString);
        MessageDigest md = MessageDigest.getInstance("SHA-512");
        md.update(salt);
        byte[] bytes = md.digest(passwordToHash.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte aByte : bytes) {
            sb.append(String.format("%02x", aByte));
        }
        generatedPassword = sb.toString();

        return generatedPassword;
    }

    public String stringName = "";
}
