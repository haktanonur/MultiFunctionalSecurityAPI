package com.onur.security;

import java.security.SecureRandom;
import java.util.Base64;

public class SecretKeyGenerator {

    public static void main(String[] args) {
        generateSecretKey();
    }

    public static void generateSecretKey() {
        // Secret key için byte dizisi oluşturma
        SecureRandom secureRandom = new SecureRandom();
        byte[] key = new byte[32]; // 256 bit için 32 byte uzunluğunda bir key
        secureRandom.nextBytes(key);

        // Base64 ile byte dizisini string'e çevirme
        String base64Key = Base64.getEncoder().encodeToString(key);
        System.out.println("Generated Secret Key: " + base64Key);
    }
}
