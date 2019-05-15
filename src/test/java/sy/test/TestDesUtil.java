package sy.test;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;


import java.security.SecureRandom;


import javax.crypto.KeyGenerator;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
import web.util.DESUtil;
import web.util.EncryptPropertyPlaceholderConfigurer;

public class TestDesUtil {


	private static String CHARSETNAME = "UTF-8";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		
		//System.out.println(des.getEncryptString("123456"));
		//QAHlVoUc49w=
		
		//System.out.println(des.getDecryptString());
        	//DESUtil des=new DESUtil();
        	String str="QAHlVoUc49w";
        	
        System.out.println(DESUtil.decrypt("vF3iBHdUSSGbEbvNo4S+37uzKpz74VI9VT6ChI51EmLlsF2uM6hllbGWwlW6QJVJu3262mei1Jk0bVDXQ32u3w==","01234567"));
		//String str="QAHlVoUc49w";
		//EncryptPropertyPlaceholderConfigurer e= new EncryptPropertyPlaceholderConfigurer();
		
		//Cipher cipher = Cipher.getInstance(ALGORITHM);
		//cipher.init(Cipher.ENCRYPT_MODE, key);des.getDecryptString()
		
		

	}
	
	public static String str2HexStr(String str) {
	    char[] chars = "0123456789ABCDEF".toCharArray();
	    StringBuilder sb = new StringBuilder("");
	    byte[] bs = str.getBytes();
	    int bit;
	    for (int i = 0; i < bs.length; i++) {
	        bit = (bs[i] & 0x0f0) >> 4;
	        sb.append(chars[bit]);
	        bit = bs[i] & 0x0f;
	        sb.append(chars[bit]);
	        // sb.append(' ');
	    }
	    return sb.toString().trim();
	}
}
	

