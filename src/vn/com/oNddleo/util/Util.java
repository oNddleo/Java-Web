package vn.com.oNddleo.util;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

public class Util {
	public static String passwordMD5(String password) throws NoSuchAlgorithmException {
		String hash = "35454B055CC325EA1AF2126E27707052";
	         
	    MessageDigest md = MessageDigest.getInstance("MD5");
	    md.update(password.getBytes());
	    byte[] digest = md.digest();
//	    String myHash = DatatypeConverter
//	      .printHexBinary(digest).toUpperCase();
//	    assertThat(myHash.equals(hash)).isTrue(); 
	    return digest.toString();
	}
}
