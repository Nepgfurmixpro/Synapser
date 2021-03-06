package com.neothedeveloper.synapser.minecraft.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA1 {
    public static byte[] generate(byte[] bytes) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            md.update(bytes);
            return md.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

    }
}
