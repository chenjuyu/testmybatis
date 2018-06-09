package pos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pos.dao.BarcodeMapper;
import pos.model.Barcode;
import pos.model.BarcodeExample;
import pos.service.BarCodeService;
@Service("BarCodeSerivceImpl")
public class BarCodeSerivceImpl implements BarCodeService {
	
	@Autowired
	private BarcodeMapper bm;	
 public	List<Barcode> selectByExample(String barcode){
	 
	 BarcodeExample be=new BarcodeExample(); 
	 BarcodeExample.Criteria creteria=be.createCriteria();
	 creteria.andBarcodeEqualTo(barcode);
	 List<Barcode> list=bm.selectByExample(be);
	 
	 return list;
//	 for (Barcode ba:list){
		 
		 
		 
		 
		 
//	 } 
	 
	 
	
 }
	
	

}
