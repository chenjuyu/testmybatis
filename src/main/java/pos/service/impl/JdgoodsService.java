package pos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pos.dao.JdgoodsMapper;
import pos.model.Jdgoods;
import pos.model.JdgoodsExample;
import pos.service.IJdgoods;

@Service("JdgoodsService")
public class JdgoodsService implements IJdgoods {
	
	@Autowired 
	private JdgoodsMapper jdgoodsmaapper; 
	
	
	

	@Override
	public int countByExample(JdgoodsExample example) {
		// TODO Auto-generated method stub
		return jdgoodsmaapper.countByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String goodsid) {
		// TODO Auto-generated method stub
		return jdgoodsmaapper.deleteByPrimaryKey(goodsid);
	}

	@Override
	public int insert(Jdgoods record) {
		// TODO Auto-generated method stub
		return jdgoodsmaapper.insert(record);
	}

	@Override
	public int updateByPrimaryKey(Jdgoods record) {
		// TODO Auto-generated method stub
		return jdgoodsmaapper.updateByPrimaryKey(record);
	}

}
