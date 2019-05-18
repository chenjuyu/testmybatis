package pos.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import pos.model.Goods;
import pos.model.Jdgoods;
import pos.model.JdgoodsExample;
import pos.service.IJdgoods;

import com.alibaba.fastjson.JSON;

import web.util.AjaxJson;
import web.util.Common;
import web.util.LoginUtilParameter;
import web.util.OAuth;
import web.util.oConvertUtils;

import com.jd.open.api.sdk.JdClient;
import com.jd.open.api.sdk.DefaultJdClient;
import com.jd.open.api.sdk.JdException;
import com.jd.open.api.sdk.request.ECLP.EclpGoodsTransportGoodsInfoRequest;
import com.jd.open.api.sdk.response.ECLP.EclpGoodsTransportGoodsInfoResponse;


@Controller
@RequestMapping("main")
public class ManagerController {
	
	@Autowired
	private IJdgoods jdgoodsservice;
	
	public JdClient client;
	
	@RequestMapping("/index")
	public ModelAndView index(HttpServletRequest re){
		
		if(re.getSession().getAttribute("userid")==null){
			
		    return new ModelAndView("login");//重定向

		}		
		Map<String,Object> map=new HashMap<String,Object>();
//		String str=null;
//		try {
//			str =URLDecoder.decode(re.getParameter("map"), "UTF-8");
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		map.put("user",LoginUtilParameter.user);	
		return new ModelAndView("lmain",map);
	}
	
	@RequestMapping("/goods")
	public ModelAndView getgoods(HttpServletRequest re,HttpServletResponse rp){
		return new ModelAndView("goodslist");
	}
	
	@RequestMapping("/jdgoods")
	@ResponseBody
	public AjaxJson jdgoods(HttpServletRequest re){
		//https://api.jd.com/routerjson
		AjaxJson j=new AjaxJson();
		String jsonstr=oConvertUtils.getString(re.getParameter("datas"));
		
		System.out.println("jsonstr:"+jsonstr);
		
		List<Map> list=JSON.parseArray(jsonstr, Map.class);
		
		
		Map<String,Object> map=OAuth.transToken();
		
		String accessToken=String.valueOf(map.get("access_token"));
		
		String appKey=String.valueOf(map.get("appKey"));
		
		String appSecret=String.valueOf(map.get("appSecret"));
		
		
	    System.out.println("list的值:"+list.toString());
		
		if(list.size()>0){
		for(int i=0;i<list.size();i++){
			Map<String,Object> m=list.get(i);
			
			System.out.println(String.valueOf(m.get("Code"))+"\n");
			System.out.println(String.valueOf(m.get("GoodsID"))+"\n");
			System.out.println(String.valueOf(m.get("Name"))+"\n");
			System.out.println("Barcodes:"+String.valueOf(m.get("Barcodes"))+"\n");
		    client=new DefaultJdClient("https://api.jd.com/routerjson",accessToken,appKey,appSecret); 
			EclpGoodsTransportGoodsInfoRequest request=new EclpGoodsTransportGoodsInfoRequest();
			request.setDeptNo("EBU4418046578252");//事业部的编码
			request.setIsvGoodsNo(String.valueOf(m.get("Code"))); //ISV主商品编码(不可修改) (长度：60)
			//request.setSpGoodsNo("38578045095");
			request.setBarcodes(String.valueOf(m.get("Barcodes")));
			request.setThirdCategoryNo("11991"); //短库
			request.setGoodsName("测试商品请不要购买");//g.getName()
			request.setAbbreviation("测试商品请不要购买");
			request.setBrandNo("290850");
			request.setBrandName("测试品牌");
			request.setManufacturer("测试品牌");
			request.setProduceAddress("测试品牌");
		//	request.setStandard("5L220V");
		//	request.setColor("红色");
		//	request.setSize("5寸");
		//	request.setSizeDefinition("小件");
		//	request.setGrossWeight(23.2);
		//	request.setNetWeight(23.1);
		//	request.setLength( 4);
		//	request.setWidth(5);
		//	request.setHeight(8);
			request.setSafeDays(12);
//			request.setSerial("1");
//			request.setBatch("1");
//			request.setCheapGift("1");
//			request.setQuality("2");
//			request.setExpensive("2");
//			request.setLuxury("1");
//			request.setBreakable("2");
//			request.setLiquid("1");
//			request.setConsumables("2");
//			request.setAbnormal("2");
//			request.setImported("1");
//			request.setHealth("2");
//			request.setTemperature("1");
//			request.setTemperatureCeil("33");
//			request.setTemperatureFloor("1");
//			request.setHumidity("2");
//			request.setHumidityCeil("12");
//			request.setHumidityFloor("2");
//			request.setMovable("1");
//			request.setService3g("1");
//			request.setSample("2");
//			request.setOdor("2");
//			request.setSex("2");
//			request.setPrecious("1");
//			request.setMixedBatch("1");
//			request.setReserve1("test");
//			request.setReserve2("test");
//			request.setReserve3("test");
//			request.setReserve4("test");
//			request.setReserve5("test");
//			request.setReserve6("test");
//			request.setReserve7("test");
//			request.setReserve8("test");
//			request.setReserve9("test");
//			request.setReserve10("test");
//			request.setFashionNo("DL340059-0M");
//			request.setGoodsUnit("3");
//			request.setCustomMade("1");
//		//	request.setSignType(1);
//			request.setOverseaPurchase("1");
//			request.setQiRecord("EWAO");
//			request.setCustomRecord("HAIG31");
//			request.setPattern("1");
//			request.setCcProvider("北京服务商");
//			request.setBondedArea("北京保税区");
//			request.setSellerRecord("W3WQ22");
//			request.setBatAttrIds("1,2");
//			request.setNeedJDRecord("2");
//			request.setModelNumber("纸尿裤XL 30片/包");
//			request.setSpe("12SX");
//			request.setVatRate(20);
//			request.setTaxRate(35);
//			request.setTaxNumberPost("01000000");
//			request.setPostRate("25");
//			request.setHsCode("H000211223");
//			request.setCountry("香港");
//			request.setQiCountry("北京");
//			request.setFlag("1");
//			request.setLegalUnit1("件");
//			request.setLegalAmount1("11");
//			request.setLegalUnit2("个");
//			request.setLegalAmount2("23");
//			request.setMeasurement("箱");
//			request.setQiMeasurement("批次");
//			request.setDelivery("美国");
//			request.setContraband(" 1");
//			request.setStoreProperty("2");
//			request.setProductCategory("1");
//			request.setCategory("86118");
//			request.setApprovalNo("Y991,X08");
//			request.setStorage("常温保存");
//			request.setForm("11012");
//			request.setType("中药");
//			request.setSpecification("ZH442");
//			request.setGenericName("999感冒灵");
//			request.setDosage("一日三次");
//			request.setUseMethods("冲剂");
//			request.setPackingUnit("23");
//			request.setEfficacy("感冒,咳嗽");
//			request.setManufactory("北京海燕药业有限公司");
//		//	request.setPrice(23);
//		//	request.setStoreSaleFlag(1);
//			request.setKeyMaintenance("8");
//			request.setSpecialDrugs("9");
//		//	request.setBoxRule(2);
//			request.setWarningDay(12);
//			request.setRegularAdventDay(5);
//			request.setUrgentAdventDay(2);
//			request.setAdventDay(6);
//			request.setEasyPollute("1");
//			request.setMuslim("1");
//		//	request.setBoxRegulations(24);
//			request.setAllowedDay(11);
//			request.setSellerFirstCategory("药品一级分类");
//			request.setSellerSecondCategory("药品二级分类");
//			request.setSellerThirdCategory("药品三级分类");
//			request.setSellerFirstCategoryNo("A001");
//			request.setSellerSecondCategoryNo("C009");
//			request.setSellerThirdCategoryNo("D043");
//			//request.setAthletesUseCaution(1);
//			//request.setElecSupervisionCodeFlag(1);
//			request.setHgsbys("费用超过5000");
//			request.setLargeCargoTransport("2");
//			//request.setUniqueCode(1);
//			request.setProductLine("test");
//			request.setIsStandardInstrument("test");
//			request.setIsColdChain("test");
//			request.setIsDetachablePackage("test");
//			request.setCertificateNo("test");
//			request.setBusinessTypeName("5层瓦楞");
//			request.setOwnerTypeName("中性");
//			request.setPackageTypeName("缠绕膜");
//			request.setMaterialTypeName("袋");
//			request.setModel("型号");
//			
//			request.setBodyParts("test");
//			request.setStyleSex("test");
//			request.setListedBand("test");
//			request.setExpectListedTime("test");
//			request.setFabric("test");
//			request.setWashing("test");
//			request.setYear("test");
//			request.setProductSeason("test");
//			request.setAfterSaleFlag("test");
			try {
				EclpGoodsTransportGoodsInfoResponse response=client.execute(request);
				
				if(response.getGoodsNo() !=null || !"".equals(response.getGoodsNo())){
					Jdgoods jdgoods=new Jdgoods();
					jdgoods.setGoodsid(String.valueOf(m.get("GoodsID")));
					jdgoods.setCode(String.valueOf(m.get("Code")));
					jdgoods.setName(String.valueOf(m.get("Name")));
					jdgoods.setBarcodes(String.valueOf(m.get("Barcodes")));
					jdgoods.setGoodsno(response.getGoodsNo());
					
					JdgoodsExample example=new JdgoodsExample();	
					JdgoodsExample.Criteria cr= example.createCriteria();
					cr.andGoodsidEqualTo(String.valueOf(m.get("GoodsID")));
			    	int count=jdgoodsservice.countByExample(example);
				
	                 if(count > 0){
	                	 jdgoodsservice.updateByPrimaryKey(jdgoods);
	           
	                 }else{
	                	 jdgoodsservice.insert(jdgoods);
	                 }			
					
					
					
					
					
				}
				
				
				System.out.println("getGoodsNo值:"+response.getGoodsNo());
				
			} catch (JdException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
		
		
	//	System.out.println("list:"+list.toString());
		
		j.setMsg("成功执行");
		return j;
	}
	
		
	@RequestMapping("/jdindex")
	public ModelAndView jdindex(HttpServletRequest re,HttpServletResponse rp){
		return new ModelAndView("jdindex");
	}
	
	
	
	
	

}