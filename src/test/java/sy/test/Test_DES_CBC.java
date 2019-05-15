package sy.test;

import web.util.DES_CBC;

public class Test_DES_CBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String content="money=0.01&m_paytype=wxpay&dynamic_id=134704029855640789";
		String key="01234567";
	
		System.out.println("加密前："+DES_CBC.byteToHexString(content.getBytes()));
		byte[] encrypted=DES_CBC.DES_CBC_Encrypt(content.getBytes(), key.getBytes());
		System.out.println("加密后："+DES_CBC.byteToHexString(encrypted));
		byte[] decrypted=DES_CBC.DES_CBC_Decrypt(encrypted, key.getBytes());
		System.out.println("解密后："+DES_CBC.byteToHexString(decrypted));

		
		
		
	}

}
