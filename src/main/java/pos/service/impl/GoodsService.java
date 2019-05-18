package pos.service.impl;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pos.dao.BarcodeMapper;
import pos.dao.GoodsMapper;
import pos.model.Barcode;
import pos.model.Goods;
import pos.model.GoodsExample;
import pos.service.IGoods;
import web.util.system.plugins.PagingView;
@Service("GoodsService")
public class GoodsService implements IGoods {
	
	@Autowired
	GoodsMapper  goodsmapper;
	@Autowired
	BarcodeMapper barcodeMapper;
	
	@Override
	public List<Goods> selectByExample(GoodsExample example) {
		// TODO Auto-generated method stub
		return goodsmapper.selectByExample(example);
	}

	@Override
	public HashMap<String, Object> goodslist(String conditions,
			int pageno, int pagesize) {
		
		PagingView p=new PagingView(Integer.valueOf(pageno).intValue());
		p.setPageSize(pagesize);
		
		HashMap<String, Object> map=new HashMap<String, Object>();
		
		 if(conditions !=null || !"".equals(conditions) ){
		
          map.put("conditions", conditions);			 	 
		 }
		 int total =this.goodsmapper.goodscount(map);
		 map.put("page", p);
	   List<HashMap<String, Object>> goods = this.goodsmapper.goodslist(map);
	   
	   if(goods.size()>0){
		
		for(int i=0;i<goods.size();i++){
			HashMap<String, Object> hmap=goods.get(i);
			conditions =" a.GoodsID='"+String.valueOf(hmap.get("GoodsID"))+"'";
			List<Barcode> bar=barcodeMapper.barcodelist(conditions);
			
			if(bar.size()>0){
				String barcode="";
			for(Barcode b:bar){
				if(b.getGoodsid().equals(String.valueOf(hmap.get("GoodsID"))))
				{
					barcode =barcode+b.getBarcode()+",";
				}	
			}
			barcode=barcode.substring(0, barcode.length()-1);
			hmap.put("Barcodes", barcode);
				
				
				
				
			}
			
			
			
			
		}   	   
	   }
	   
	   HashMap<String, Object> m=new HashMap<String, Object>();
	     m.put("total", total);
	     m.put("rows", goods);
	     
	     
	     
	   
		
		
		return m;
	}



}
