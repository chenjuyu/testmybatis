package web.util;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/*
 * 解密数据库用户与密码用在配置xml文件中用
 */
public class EncryptPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {
	
	// 需要解密的字段
	private String[] encryptPropNames = { "jdbc_username", "jdbc_password" };
	String password="12345678";
	@Override
	protected String convertProperty(String propertyName, String propertyValue) {
	if (isEncryptProp(propertyName)) {
	// 解密\
		 
	String decryptValue = DESUtil.decrypt(propertyValue, password);//des.getDecryptString(propertyValue);
	return decryptValue;
	} else {
	return propertyValue;
	}
	}
	private boolean isEncryptProp(String propertyName) {
	for (String encryptpropertyName : encryptPropNames) {
	if (encryptpropertyName.equals(propertyName))
	return true;
	}
	return false;
	}

}
