package pos.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import pos.model.BorrowingLog;

import web.util.PageUtils;
import web.util.Paging;

public interface BorrowingLogMapper {
    int deleteByPrimaryKey(String id);

    int insert(BorrowingLog record);

    int insertSelective(BorrowingLog record);

    BorrowingLog selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BorrowingLog record);

    int updateByPrimaryKey(BorrowingLog record);
    //List<BorrowingLog> selectAll();
    public List<BorrowingLog> getAll(Paging paging);
    public int getCount();
    public List<BorrowingLog> findPage(@Param(value="borrower") String borrower,@Param(value="currentPage") int currentPage,@Param(value="pageCount") int pageCount);
   // public List<BorrowingLog> findPage(@PathVariable String ID);
    public int findTotal(@Param(value="borrower") String borrower);
    
    public List<BorrowingLog> findPage2();



	
}