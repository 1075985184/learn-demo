package duo.xian.cheng.demo.com;

import javax.crypto.*;
import javax.crypto.spec.*;
import java.security.*;
import java.security.spec.*;
import javax.xml.bind.*;

public class Protect
{
    static String IV;
    static String encryptionKey;
    //private static sun.misc.BASE64Encoder base64Encoder = new sun.misc.BASE64Encoder();
   
    
    public static String getEncryptedPsw(String password) {
		String encrypted = null;
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(password.getBytes());
			encrypted = DatatypeConverter.printBase64Binary(md.digest());
		} catch (NoSuchAlgorithmException e) {
		}
		return encrypted;
	}
    
    public static String encrypt(final byte[] data) throws Exception {
        return encrypt(data, Protect.encryptionKey);
    }
    
    public static String encrypt(final byte[] data, final String encryptionKey) throws Exception {
        final Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding", "SunJCE");
        final SecretKeySpec key = new SecretKeySpec(encryptionKey.getBytes("UTF-8"), "AES");
        cipher.init(1, key, new IvParameterSpec(Protect.IV.getBytes("UTF-8")));
        return DatatypeConverter.printBase64Binary(cipher.doFinal(data));
    }
    
    public static String decrypt(final String cipherText) throws Exception {
        return decrypt(cipherText, Protect.encryptionKey);
    }
    
    public static String decrypt(final String cipherText, final String encryptionKey) throws Exception {
        final Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding", "SunJCE");
        final SecretKeySpec key = new SecretKeySpec(encryptionKey.getBytes("UTF-8"), "AES");
        cipher.init(2, key, new IvParameterSpec(Protect.IV.getBytes("UTF-8")));
        return new String(cipher.doFinal(DatatypeConverter.parseBase64Binary(cipherText)), "UTF-8");
    }
    
    public static byte[] representAsByte(final String cipherText) throws Exception {
        final Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding", "SunJCE");
        final SecretKeySpec key = new SecretKeySpec(Protect.encryptionKey.getBytes("UTF-8"), "AES");
        cipher.init(2, key, new IvParameterSpec(Protect.IV.getBytes("UTF-8")));
        return cipher.doFinal(DatatypeConverter.parseBase64Binary(cipherText));
    }
    
    public static byte[] representAsByte(final String cipherText, final String serverUUID) throws Exception {
        final Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding", "SunJCE");
        final SecretKeySpec key = new SecretKeySpec(serverUUID.substring(0, 16).getBytes("UTF-8"), "AES");
        cipher.init(2, key, new IvParameterSpec(serverUUID.substring(16, 32).getBytes("UTF-8")));
        return cipher.doFinal(DatatypeConverter.parseBase64Binary(cipherText));
    }
    
    static {
        Protect.IV = "9D2EAD401622F0BA";
        Protect.encryptionKey = "732DECD9832CD8E4";
    }
}
