package service;

import java.util.HashMap;
import java.util.List;
import vo.StockVO;

public interface StockService {
    //페이징을 하기 위한 리스트의 총 갯수
    Integer getStockCnt();

    //페이징 리스트 조회
    List<HashMap<String, Object>>  getStockListPaging(HashMap<String, Object> param);

    //리스트 전체 조회
    List<StockVO> getStockList();

    //데이터 입력
    int insertStock(StockVO inputData);

    //데이터 수정(업데이트)
    int updateStock(StockVO inputData);
}