package web.util;


import java.security.SecureRandom;
//import java.util.Base64;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.SecretKey;
import javax.crypto.Cipher;

public class DESUtil {
    /**
     * 测试方法
     */
	 String str="sa";
 private static	String password = "01234567";
 private final static String DES ="DES"; //"DES"; // 选择CBC模式     进行加解密
    public static void main(String[] args) {
       // String str = "你好,goldlone";
        //密码最好是8的倍数
       
        
      //  String encryStr =  DES.encrypt(str, password);
      //  System.out.println("加密结果："+encryStr);
    	//4B98FDF4AFA71F188D7A7FF8D675BD9ED6B1BF7E13DAE9AC08B26E1BAC227C549D041AD3B370FE2ACBCC03D08E033FC40188FF40C2BAE5FC
        //encryStr
    	//String src = "money=0.01&m_paytype=wxpay&dynamic_id=134704029855640789";  
        //String crypto = DESUtil.encrypt(src);  
      //  System.out.println("加密结果："+crypto);
        String decryStr = DESUtil.decrypt("vF3iBHdUSSGbEbvNo4S+37uzKpz74VI9VT6ChI51EmLlsF2uM6hllbGWwlW6QJVJu3262mei1Jk0bVDXQ32u3w==");
        System.out.println("解密结果："+decryStr);
    }
    
    /**
     * 进行加密操作
     * 参数一：待加密的字符串，参数二：加密密钥
     * 返回经过Base64编码后的字符串
     * 编码格式为UTF-8
     */
    public static String encrypt(String encryptionStr, String password) {
        try{
            byte[] encryptionBytes = encryptionStr.getBytes("UTF-8");
            SecureRandom random = new SecureRandom();
            DESKeySpec desKey = new DESKeySpec(password.getBytes());
            // 创建一个密钥工厂，然后用它把DESKeySpec转换成
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey securekey = keyFactory.generateSecret(desKey);
            // Cipher对象实际完成加密操作
            Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");  //
            // 用密钥初始化Cipher对象
            cipher.init(Cipher.ENCRYPT_MODE, securekey, new IvParameterSpec(password.getBytes())); //random
            // 执行加密操作   
        //    byte[] encryptionBase64Bytes = Base64.getEncoder().encode(cipher.doFinal(encryptionBytes));
            // 转换为字符串返回
        //    return new String(encryptionBase64Bytes);
            return null;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    /**
     * 进行解密操作
     * 参数一：待解密的字符串，参数二：加密密钥
     * 返回解密后的字符串
     */
    public static String decrypt(String decryptionBase64Str, String password) {
        try {
       //     byte[] decryptionbytes = Base64.getDecoder().decode(decryptionBase64Str);
            // DES算法要求有一个可信任的随机数源
            SecureRandom random = new SecureRandom();
            // 创建一个DESKeySpec对象
            DESKeySpec desKey = new DESKeySpec(password.getBytes());
            // 创建一个密钥工厂
            SecretKeyFactory keyFactory =SecretKeyFactory.getInstance("DES"); //SecretKeyFactory.getInstance("DES"); 
            // 将DESKeySpec对象转换成SecretKey对象
            SecretKey securekey = keyFactory.generateSecret(desKey);
            // Cipher对象实际完成解密操作
            Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");//Cipher.getInstance("DES"); 选择CBC模式     进行加解密
            // 用密钥初始化Cipher对象
            cipher.init(Cipher.DECRYPT_MODE, securekey, new IvParameterSpec(password.getBytes()));//random
            // 开始解密操作
           // return new String(cipher.doFinal(decryptionbytes), "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    public static byte[] encrypt(byte[] src, byte[] key) throws Exception {  
        // DES算法要求有一个可信任的随机数源  
        SecureRandom sr = new SecureRandom();  
        // 从原始密匙数据创建DESKeySpec对象  
        DESKeySpec dks = new DESKeySpec(key);  
        // 创建一个密匙工厂，然后用它把DESKeySpec转换成  
        // 一个SecretKey对象  
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);  
        SecretKey securekey = keyFactory.generateSecret(dks);  
        // Cipher对象实际完成加密操作  
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");  
        // 用密匙初始化Cipher对象  
        cipher.init(Cipher.ENCRYPT_MODE, securekey, sr);  
        // 现在，获取数据并加密  
        // 正式执行加密操作  
        return cipher.doFinal(src);  
    }  
  
    /** 
     * 解密 
     *  
     * @param src 
     *            密文(字节) 
     * @param key 
     *            密钥，长度必须是8的倍数 
     * @return 明文(字节) 
     * @throws Exception 
     */  
    public static byte[] decrypt(byte[] src, byte[] key) throws Exception {  
        // DES算法要求有一个可信任的随机数源  
        SecureRandom sr = new SecureRandom(new byte[8]);  
        // 从原始密匙数据创建一个DESKeySpec对象  
        DESKeySpec dks = new DESKeySpec(key);  
        // 创建一个密匙工厂，然后用它把DESKeySpec对象转换成  
        // 一个SecretKey对象  
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);  
        SecretKey securekey = keyFactory.generateSecret(dks);  
        // Cipher对象实际完成解密操作  
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");  //选择CBC模式     进行加解密DES
        // 用密匙初始化Cipher对象  
        cipher.init(Cipher.DECRYPT_MODE, securekey, sr);  
        // 现在，获取数据并解密  
        // 正式执行解密操作  
        return cipher.doFinal(src);  
    } 
    
    /** 
     * 加密 
     *  
     * @param src 
     *            明文(字节) 
     * @return 密文(字节) 
     * @throws Exception 
     */  
    public static byte[] encrypt(byte[] src) throws Exception {  
        return encrypt(src, password.getBytes());  
    }  
  
    /** 
     * 解密 
     *  
     * @param src 
     *            密文(字节) 
     * @return 明文(字节) 
     * @throws Exception 
     */  
    public static byte[] decrypt(byte[] src) throws Exception {  
        return decrypt(src, password.getBytes());  
    }  
  
    /** 
     * 加密 
     *  
     * @param src 
     *            明文(字符串) 
     * @return 密文(16进制字符串) 
     * @throws Exception 
     */  
    public final static String encrypt(String src) {  
        try {  
            return byte2hex(encrypt(src.getBytes(), password.getBytes()));  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return null;  
    }  
  
    /** 
     * 解密 
     *  
     * @param src 
     *            密文(字符串) 
     * @return 明文(字符串) 
     * @throws Exception 
     */  
    public final static String decrypt(String src) {  
        try {  
            return new String(decrypt(hex2byte(src.getBytes()), password.getBytes()));  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return null;  
    }  
  
    /** 
     * 加密 
     *  
     * @param src 
     *            明文(字节) 
     * @return 密文(16进制字符串) 
     * @throws Exception 
     */  
    public static String encryptToString(byte[] src) throws Exception {  
        return encrypt(new String(src));  
    }  
  
    /** 
     * 解密 
     *  
     * @param src 
     *            密文(字节) 
     * @return 明文(字符串) 
     * @throws Exception 
     */  
    public static String decryptToString(byte[] src) throws Exception {  
        return decrypt(new String(src));  
    }  
  
    public static String byte2hex(byte[] b) {  
        String hs = "";  
        String stmp = "";  
        for (int n = 0; n < b.length; n++) {  
            stmp = (java.lang.Integer.toHexString(b[n] & 0XFF));  
            if (stmp.length() == 1)  
                hs = hs + "0" + stmp;  
            else  
                hs = hs + stmp;  
        }  
        return hs.toUpperCase();  
    }  
  
    public static byte[] hex2byte(byte[] b) {  
        if ((b.length % 2) != 0)  
            throw new IllegalArgumentException("长度不是偶数");  
        byte[] b2 = new byte[b.length / 2];  
        for (int n = 0; n < b.length; n += 2) {  
            String item = new String(b, n, 2);  
            b2[n / 2] = (byte) Integer.parseInt(item, 16);  
        }  
        return b2;  
    }  
    
}