package pos.model;

public class JsonMessage {
 
	/*
	 * 消息编号
	 */
	private String code = "0";
	
	/*
	 * 信息内容
	 */
	private String message = "";
	
	/*
	 * 信息数据
	 */
	private Object data = "";

	public String getCode() {
		return code; 
	}

	/*
	 * 设置信息编号
	 */
	public void setCode(String code) {
		this.code = code;
	}

	

	public Object getData() {
		return data;
	}

	/*
	 * 设置信息数据
	 */
	public void setData(Object data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	/*
	 * 设置提示信息
	 */
	public void setMessage(String message) {
		this.message = message;
	}
}
