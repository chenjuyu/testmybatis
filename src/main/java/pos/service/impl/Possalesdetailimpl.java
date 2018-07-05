package pos.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pos.dao.PossalesdetailMapper;
import pos.model.Possalesdetail;
import pos.model.PossalesdetailExample;
import pos.service.IPossalesdetail;
import web.util.system.plugins.PagingView;
@Service("possalesdetail")
public class Possalesdetailimpl implements IPossalesdetail {

 @Autowired	
 public	PossalesdetailMapper  possalesdetail;

@Override
public HashMap<String, Object> possalesdetaillist(
		String conditions, int pageno, int pagesize) {
	PagingView page=new PagingView(pageno);
	page.setPageSize(pagesize);
	HashMap<String, Object> param=new HashMap<String, Object>();
	param.put("conditions", conditions);
	List<HashMap<String, Object>> total= possalesdetail.possalesdetailtotal(param);
	
	
	param.put("page", page);
	List<HashMap<String, Object>> map1 =possalesdetail.possalesdetaillist(param);
	HashMap<String, Object> map=new HashMap<String, Object>();
	map.put("rows", map1);
	map.put("total", page.getRowCount());
	map.put("footer", total);
	return map;
}

@Override
public int selectByPrimaryKey(Integer possalesdetailid) {
	// TODO Auto-generated method stub
	
	Possalesdetail p= possalesdetail.selectByPrimaryKey(possalesdetailid);
    if(p.getPossalesdetailid()>0){
    	
    	return 1;
    } else{
	    return 0;
    }
}

@Override
public int deleteByPrimaryKey(Integer possalesdetailid) {
	// TODO Auto-generated method stub
	return possalesdetail.deleteByPrimaryKey(possalesdetailid);
}

@Override
public int updateByPrimaryKeySelective(Possalesdetail record) {
	// TODO Auto-generated method stub
	return possalesdetail.updateByPrimaryKeySelective(record);
}

@Override
public List<Possalesdetail> selectByExample(PossalesdetailExample example) {
	// TODO Auto-generated method stub
	return possalesdetail.selectByExample(example);
}
	
	
	

}
