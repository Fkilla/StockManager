package dao;

import java.util.HashMap;
import java.util.List;
import vo.StockVO;

public interface StockDao {

    Integer selectStockCnt();

    List<HashMap<String, Object>>  selectStockListPaging(HashMap<String, Object> param);

    List<StockVO> selectStockList();

    int insertStock(StockVO inputData);

    int updateStock(StockVO inputData);
}