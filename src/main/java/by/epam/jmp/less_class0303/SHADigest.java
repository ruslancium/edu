package by.epam.jmp.less_class0303;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Ruslan_Arifullin on 3/3/2017.
 */
public class SHADigest {
    public static void main(String[] args) {
        String password = "Pass_1";
        MessageDigest messageDigest = null;
        byte[] bytesEncoded = null;

        try {
            messageDigest = MessageDigest.getInstance("SHA-1"); // 1 раз !!!!!
            messageDigest.update(password.getBytes("utf8"));
            bytesEncoded = messageDigest.digest();
        }
        catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        BigInteger bigInt = new BigInteger(1, bytesEncoded); //…. 1 ?
        String resHex = bigInt.toString(16);
        System.out.println(resHex);
    }
}
