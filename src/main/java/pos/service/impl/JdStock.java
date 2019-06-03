package pos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pos.dao.JdstockMapper;
import pos.model.Jdstock;
import pos.model.JdstockExample;
import pos.service.IJdstock;
@Service("jdstockService")
public class JdStock implements IJdstock {
 
	@Autowired
	private JdstockMapper jdstockMapper;
	
	@Override
	public int countByExample(JdstockExample example) {
		// TODO Auto-generated method stub
		return jdstockMapper.countByExample(example);
	}

	@Override
	public int insert(Jdstock record) {
		// TODO Auto-generated method stub
		return jdstockMapper.insert(record);
	}

}
