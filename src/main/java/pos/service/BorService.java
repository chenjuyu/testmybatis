package pos.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import pos.model.BorrowingLog;


import web.util.PageUtils;
import web.util.Paging;

public interface BorService {
	/**
	 * ���id��ȡ������
	 * @param id
	 * @return
	 */
	public BorrowingLog getBorrowingById(String id);
	public BorrowingLog insertSelective(String ID,String ledger);
	/*public List<BorrowingLog> selectAll();*/
	public List<BorrowingLog> getAll(Paging paging);
    public int getCount();
    //public List<BorrowingLog> findPage(PageUtils p);
    public List<BorrowingLog> findPage(@Param(value="borrower") String borrower,@Param(value="currentPage") int currentPage,@Param(value="pageCount") int pageCount);
    public int findTotal(@Param(value="borrower")String borrower);
    
    int updateByPrimaryKeySelective(BorrowingLog record);


}
