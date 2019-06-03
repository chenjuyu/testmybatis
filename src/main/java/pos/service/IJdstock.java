package pos.service;

import pos.model.Jdstock;
import pos.model.JdstockExample;

public interface IJdstock {
	int countByExample(JdstockExample example);
	int insert(Jdstock record);
}
