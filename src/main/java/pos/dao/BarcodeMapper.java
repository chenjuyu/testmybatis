package pos.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pos.model.Barcode;
import pos.model.BarcodeExample;

public interface BarcodeMapper {
   
    int countByExample(BarcodeExample example);

 
    int insert(Barcode record);

  
    int insertSelective(Barcode record);

   
    List<Barcode> selectByExample(BarcodeExample example);
    List<Barcode> barcodelist(@Param(value="conditions") String conditions );
}