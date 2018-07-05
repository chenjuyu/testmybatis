package pos.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import pos.dao.BorrowingLogMapper;
import pos.model.BorrowingLog;
import pos.service.BorService;


import web.util.*;
@Service("borService")
public class BorServiceImpl implements BorService {
	
    private BorrowingLogMapper borrowingLog;

	public BorrowingLogMapper getBorrowingLog() {
		return borrowingLog;
	}
	@Autowired
	public void setBorrowingLog(BorrowingLogMapper borrowingLog) {
		this.borrowingLog = borrowingLog;
	}
	
	/**
	 * ���id��ȡ������
	 * @param id
	 * @return
	 */
	@Override
	public BorrowingLog getBorrowingById(String id) {

		return borrowingLog.selectByPrimaryKey(id);
	}
	@Override
	public BorrowingLog insertSelective(String id,String ledger){
		BorrowingLog b=new BorrowingLog();
		b.setId(id);
		b.setLedger(ledger);
	    borrowingLog.insertSelective(b);
		return b;
		}
/*	public int insertSelective2(String id,String ledger){
		BorrowingLog b=new BorrowingLog();
		b.setId(id);
		b.setLedger(ledger);
	   // borrowingLog.insertSelective2(b);
		return insertSelective2;
		} 
	public List<BorrowingLog> selectAll(){
		return borrowingLog.selectAll();
	}*/
	
	public List<BorrowingLog> getAll(Paging paging){
		
		
		return borrowingLog.getAll(paging);
	}
    public int getCount(){
    	
    	
    	return borrowingLog.getCount();
    }
    public List<BorrowingLog> findPage(@Param(value="borrower") String borrower,@Param(value="currentPage") int currentPage,@Param(value="pageCount") int pageCount) {
	    return  borrowingLog.findPage(borrower,currentPage,pageCount);  

  }
    public int findTotal(@Param(value="borrower")String borrower){
    	
    	return borrowingLog.findTotal(borrower);
    }
    public int updateByPrimaryKeySelective(BorrowingLog record){
    	
    	
    	return borrowingLog.updateByPrimaryKeySelective(record);
    }
}
