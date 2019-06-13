package web.util;

import java.util.List;
import java.util.Map;

import org.json.JSONObject;

import com.jd.open.api.sdk.DefaultJdClient;
import com.jd.open.api.sdk.JdClient;
import com.jd.open.api.sdk.JdException;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.cancelOrder.CancelResult;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.isvRtsTransfer.RtsResult;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrder.OrderDetailResult;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryPoOrder.QueryPoModel;
import com.jd.open.api.sdk.request.ECLP.EclpOrderCancelOrderRequest;
import com.jd.open.api.sdk.request.ECLP.EclpOrderQueryOrderRequest;
import com.jd.open.api.sdk.request.ECLP.EclpPoAddPoOrderRequest;
import com.jd.open.api.sdk.request.ECLP.EclpPoQueryPoOrderRequest;
import com.jd.open.api.sdk.request.ECLP.EclpRtsIsvRtsQueryRequest;
import com.jd.open.api.sdk.request.ECLP.EclpRtsIsvRtsTransferRequest;
import com.jd.open.api.sdk.request.ECLP.EclpRtwQueryRtwRequest;
import com.jd.open.api.sdk.response.ECLP.EclpOrderCancelOrderResponse;
import com.jd.open.api.sdk.response.ECLP.EclpPoAddPoOrderResponse;
import com.jd.open.api.sdk.response.ECLP.EclpPoQueryPoOrderResponse;
import com.jd.open.api.sdk.response.ECLP.EclpRtsIsvRtsQueryResponse;
import com.jd.open.api.sdk.request.ECLP.EclpOrderAddOrderRequest;
import com.jd.open.api.sdk.response.ECLP.EclpOrderAddOrderResponse;
import com.jd.open.api.sdk.response.ECLP.EclpOrderQueryOrderResponse;
import com.jd.open.api.sdk.response.ECLP.EclpRtsIsvRtsTransferResponse;
import com.jd.open.api.sdk.response.ECLP.EclpRtwQueryRtwResponse;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryRtw.RtwResult;
//接口如果有新加，要到平台下载最新的jar sdk包
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
		//request.setReferenceOrder("手工单号");
	    //request.setInboundRemark("备注信息");
		request.setWhNo("110009082"); // 110009082入库库房编号，格式：11开头，最大长度：100
		request.setSupplierNo("EMS4418047468093");//EMS4418047468093供应商编号，格式：EMS开头，最大长度：50
		request.setDeptGoodsNo(jsonstr.getString("GoodsNo")); //商品
		request.setNumApplication(jsonstr.getString("Qty"));  //jsonstr申请入库数量，最大长度：11
		request.setTotalPrice(jsonstr.getString("totalPrice"));//商品总价
		request.setGoodsStatus(jsonstr.getString("GoodsStatus"));
		
		System.out.println("本地单号："+jsonstr.getString("No"));
		
		System.out.println("京东对应货号："+jsonstr.getString("GoodsNo"));
		
		System.out.println("京东入库数量："+jsonstr.getString("Qty"));
		
		System.out.println("京东入库总价："+jsonstr.getString("totalPrice"));
		System.out.println("京东入货品状态："+jsonstr.getString("GoodsStatus"));
		
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
	
	public  List<QueryPoModel> queryPoOrder(String No) throws JdException{
		     
		    EclpPoQueryPoOrderRequest request=new EclpPoQueryPoOrderRequest();
		    request.setPoOrderNo(No);//"EPL4398046516113"
		    EclpPoQueryPoOrderResponse response=client.execute(request);
		    List<QueryPoModel> ls= response.getQueryPoModelList();
		
		return ls;
	}
	
	//退供应商下发(非备件库)
	
   public RtsResult rtsisvRtsTransfer(JSONObject jsonstr) throws JdException{
	   
	   EclpRtsIsvRtsTransferRequest request=new EclpRtsIsvRtsTransferRequest();
	  // request.setEclpRtsNo("EBS4398046520233");//	开放平台退供应商单号（EBS开头）;格式：EBS4XXXXXXXXXXX;最大长度50字符
	   request.setIsvRtsNum(jsonstr.getString("No"));//商家系统退供应商单号；必填，商家系统单号必须唯一；最大长度50字符
	   request.setRtsType("1");//退供单据类型；枚举值：1（良品非临期），2（残品非临期），6（待检品）；不必填，填写后有效性校验（取值：1、2、6）；默认取值为1；最大1个字符
	   request.setDeptNo("EBU4418046578252");//京东开放平台事业部编号；EBU开头，特殊情况下不必填；最大长度50字符
	   request.setDeliveryMode("1");//商家提货方式；枚举值：1（商家自提）、2（京东配送)；必填；存在数据有效性校验（取值范围：1、2）；必填；最大1个字符
	   request.setWarehouseNo("110009082");//	退库库房编号(出库库房编号，必须为事业部签署的正生效的物流服务下的库房)；必填，有效性校验；最大50个字符
	   request.setSupplierNo("EMS4418047468093");//供应商编号(开放平台供应商编号，若为空，默认为事业部本身)；最大长度50字符
       request.setDeptGoodsNo(jsonstr.getString("GoodsNo"));//	事业部商品编号；EMG开头；有效性校验；最大50个字符
       request.setGoodsName(jsonstr.getString("jdName"));//事业部商品名称；最大50个字符
       request.setQuantity(jsonstr.getString("Qty"));//申请退货数量；正整数
       
       EclpRtsIsvRtsTransferResponse response=client.execute(request);
       RtsResult result=  response.getRtsResult();
       
       return result;
   }	
  
   //查询退供应商详情
   public List<com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.isvRtsQuery.RtsResult>  rtsisvRtsQuery(JSONObject jsonstr) throws JdException{
	   EclpRtsIsvRtsQueryRequest request=new EclpRtsIsvRtsQueryRequest();
	   request.setEclpRtsNo(jsonstr.getString("rtsNo"));//开放平台退供应商单号（EBS开头）;格式：EBS4XXXXXXXXX01,EBSXXXXXXX02;最多50个单号查询,中间以英文逗号分隔。
	   request.setIsvRtsNum(jsonstr.getString("No"));//	I商家系统退供应商单号；最大长度50字符
	   
	   EclpRtsIsvRtsQueryResponse response=client.execute(request); //返回 响应
	    List<com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.isvRtsQuery.RtsResult> ls= response.getRtsResultList();
    
	    return ls;
   }
	
	
	
	
	

	
	public JSONObject orderaddOrder(JSONObject jsonstr) throws JdException{	
		JSONObject json=new JSONObject();
		EclpOrderAddOrderRequest request=new EclpOrderAddOrderRequest();
		request.setIsvUUID(jsonstr.getString("No")); //isv出库单号（商家出库单号），作为isv出库的唯一性校验码：长度不能超125
		request.setIsvSource("ISV0020000000068");//ISV来源编号
		request.setShopNo("ESP0020000055973");//店铺编号(B2C订单必填，B2B（soType=2）订单非必填)
	//	request.setSoType("2");
		request.setIsvSoType(jsonstr.getString("Type"));
		request.setDepartmentNo("EBU4418046578252");//事业部编码
		request.setWarehouseNo("110009082");//库房编号，事业部开启寻源拆分服务可不填；否则必填；
		request.setShipperNo(jsonstr.getString("shipperNo"));//承运商编号，默认为京东快递，CYS0000010
		request.setSalesPlatformOrderNo(jsonstr.getString("OrderNo"));//销售平台订单号，如果销售平台来源为京东平台，则该字段不能为空，长度不超过200
		request.setSalePlatformSource(jsonstr.getString("form"));//销售平台来源，参考销售平台来源查询接口的值
		request.setConsigneeName(jsonstr.getString("Customer")); //收货人姓名，长度不能超20
		request.setConsigneeMobile(jsonstr.getString("Mobile"));//收货人手机（收货人电话、手机至少有一个不为空），长度不能超30
		request.setConsigneeAddress(jsonstr.getString("Address"));//收货人地址 ，长度不能超100
		request.setOrderMark("00000000000000000000000000000000000000000000000000");
		request.setGoodsNo(jsonstr.getString("GoodsNo"));//ECLP商品编号，与商家商品编号二选一必填（两者都指定，以goodsNo为准）
		request.setGoodsName(jsonstr.getString("jdName"));//商品名称
		request.setQuantity(jsonstr.getString("Qty"));
		request.setAmount(jsonstr.getString("Amt"));
		
	  System.out.println("setIsvUUID地单号："+jsonstr.getString("No"));
		
		System.out.println("ISV来源编号："+jsonstr.getString("No"));
		
		System.out.println("setIsvSoType："+jsonstr.getString("Type"));
		
		System.out.println("承运商编号："+jsonstr.getString("shipperNo"));
		System.out.println("销售平台订单号："+jsonstr.getString("OrderNo"));
		
		System.out.println("收货人姓名："+jsonstr.getString("Customer"));
		
		System.out.println("收货人手机："+jsonstr.getString("Mobile"));
		
		System.out.println("收货人地址："+jsonstr.getString("Address"));
		System.out.println("ECLP商品编号："+jsonstr.getString("GoodsNo"));
		System.out.println("商品名称："+jsonstr.getString("jdName"));
		System.out.println("数量："+jsonstr.getString("Qty"));
		System.out.println("金额："+jsonstr.getString("Amt"));
		
		
		EclpOrderAddOrderResponse response=client.execute(request);
		
		if(!"".equals(response.getEclpSoNo()) && response.getEclpSoNo() !=null){
			json.put("msg", "生成出库单号成功");
			json.put("eclpSoNo", response.getEclpSoNo());
			System.out.println("生成出库单号成功");
		}else{
			json.put("msg", "同步失败");
			json.put("errorcode",response.getCode() );
		}
		
		
		return json;
	}
	//出库单取消
    public CancelResult ordercancelOrder(String eclpSoNo) throws JdException {
    	
    	EclpOrderCancelOrderRequest request=new EclpOrderCancelOrderRequest();
    	request.setEclpSoNo(eclpSoNo);
    	EclpOrderCancelOrderResponse response=client.execute(request);
    	CancelResult result= response.getCancelorderResult();
    	
    	return result;
    }

	
	//出库单查询
	public OrderDetailResult orderqueryOrder(String eclpSoNo) throws JdException{
		EclpOrderQueryOrderRequest request=new EclpOrderQueryOrderRequest();
		request.setEclpSoNo(eclpSoNo);
		EclpOrderQueryOrderResponse response=client.execute(request);
		
		OrderDetailResult result= response.getQueryorderResult();
		
		return result;
	}
	
	//查询退货入库单详情。开放平台退货入库单号(rtwNum)不能为空，多个中间以英文逗号分隔
	public List<RtwResult> rtwqueryRtw(JSONObject jsonstr) throws JdException{
		EclpRtwQueryRtwRequest request=new EclpRtwQueryRtwRequest();
		request.setEclpSoNo(jsonstr.getString("eclpSoNo"));//	物流开放平台出库单号(出库单号与订单号只能填一个)，ESL开头，最大长度：50
		request.setEclpRtwNo(jsonstr.getString("eclpRtwNo"));//物流开放平台退货入库单号(出库单号与订单号只能填一个)，ESR/EBR开头，最大长度：50
		request.setIsvRtwNum(jsonstr.getString("No"));//	ISV退货入库单号，最大长度：50
		request.setWarehouseNo("110009082");//物流开放平台库房编号，11开头，最大长度：50
		request.setReson("客户下错单");
		//request.setOrderInType(1);
		request.setQueryBatAttrFlag(false);
		EclpRtwQueryRtwResponse response=client.execute(request);
		List<RtwResult> ls= response.getQueryrtwResult();
		return ls;
	}
	
}
