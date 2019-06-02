package web.util;

import java.util.List;
import java.util.Map;

import org.json.JSONObject;







import com.jd.open.api.sdk.DefaultJdClient;
import com.jd.open.api.sdk.JdClient;
import com.jd.open.api.sdk.JdException;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryPoOrder.QueryPoModel;
import com.jd.open.api.sdk.request.ECLP.EclpPoAddPoOrderRequest;
import com.jd.open.api.sdk.request.ECLP.EclpPoQueryPoOrderRequest;
import com.jd.open.api.sdk.response.ECLP.EclpPoAddPoOrderResponse;
import com.jd.open.api.sdk.response.ECLP.EclpPoQueryPoOrderResponse;
public class JdTools {
	
	Map<String,Object> map=OAuth.transToken();
	String appKey=String.valueOf(map.get("appKey"));//ResourceUtil.getConfigByName("appKey");
	
	String appSecret=String.valueOf(map.get("appSecret"));//ResourceUtil.getConfigByName("appSecret");
	
	String accessToken=String.valueOf(map.get("access_token"));//ResourceUtil.getConfigByName("access_token");
	
	public   JdClient client=new DefaultJdClient("https://api.jd.com/routerjson",accessToken,appKey,appSecret); 
	
	public  JSONObject addPoOrder(JSONObject jsonstr) throws JdException{
		JSONObject j=new JSONObject();
		EclpPoAddPoOrderRequest request=new EclpPoAddPoOrderRequest();
		request.setSpPoOrderNo(jsonstr.getString("No")); //商家单号伏羲单号
		request.setDeptNo("EBU4418046578252"); //京东事业部编码
		request.setReferenceOrder("手工单号");
		request.setInboundRemark("备注信息");
		request.setWhNo("110000008"); //入库库房编号，格式：11开头，最大长度：100
		request.setSupplierNo("EMS0000000000001");//供应商编号，格式：EMS开头，最大长度：50
		request.setDeptGoodsNo(jsonstr.getString("GoodsNo")); //商品
		request.setNumApplication(jsonstr.getString("Qty"));  //jsonstr申请入库数量，最大长度：11
		request.setTotalPrice(jsonstr.getString("totalPrice"));//商品总价
		request.setGoodsStatus("1");
		
		EclpPoAddPoOrderResponse response=client.execute(request);
		
		if(!"".equals(response.getPoOrderNo()) && response.getPoOrderNo() !=null){
			j.put("msg", "生成订单号成功");
			j.put("PoOrderNo", response.getPoOrderNo());
			System.out.println("生成订单号成功");
		}else{
			j.put("msg", "同步失败");
			j.put("errorcode",response.getCode() );
		}
		return j;
	}
	public  JSONObject queryPoOrder(String No) throws JdException{
		   
		    JSONObject j=new JSONObject();
		    
		    EclpPoQueryPoOrderRequest request=new EclpPoQueryPoOrderRequest();
		    request.setPoOrderNo(No);//"EPL4398046516113"
		    EclpPoQueryPoOrderResponse response=client.execute(request);
		    List<QueryPoModel> ls= response.getQueryPoModelList();
		    
		    if(ls.size()>0){
		 //    for(QueryPoModel po :ls){
		 //    String poOrderNo =po.getPoOrderNo();//开放平台采购入库单号;最大长度50
		 //    String isvPoOrderNo=po.getIsvPoOrderNo();//ISV采购入库单号；最大长度50
		 //    String deptNo=po.getDeptNo();//开放平台事业部编号；EBU开头；最大长度50
		//     String whNo=po.getWhNo();//开放平台库房编号；最大长度50；
		 //    String supplierNo=po.getSupplierNo();//开放平台供应商编号；最大长度50
		 //    String createUser=po.getCreateUser();//采购入库单创建人;最大长度50；
		  //   String poOrderStatus=po.getPoOrderStatus();//采购入库单状态：10：新建，20：初始（下发），50：验收,70：关单；最大长度4
		     
		     
		 //    }
		    	
		    	j.put("ls", ls); 	
		    	
		    }else{
		    	return null;
		    }
		    
		    
		    
		    
		
		
		return j;
	}
	
	
	
}
