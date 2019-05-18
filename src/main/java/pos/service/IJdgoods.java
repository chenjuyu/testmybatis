package pos.service;

import pos.model.Jdgoods;
import pos.model.JdgoodsExample;

public interface IJdgoods {
	int countByExample(JdgoodsExample example);
	int deleteByPrimaryKey(String goodsid);
	int insert(Jdgoods record);
	int updateByPrimaryKey(Jdgoods record);

}
