package service;

import dao.StockDao;
import dao.StockDaoImpl;
import vo.StockVO;

import java.util.HashMap;
import java.util.List;

public class StockServiceImpl implements StockService {

    private final StockDao stockDao = new StockDaoImpl();

    @Override
    public Integer getStockCnt() {
        return stockDao.selectStockCnt();
    }

    @Override
    public  List<HashMap<String, Object>>  getStockListPaging(HashMap<String, Object> param) {
        return stockDao.selectStockListPaging(param);
    }

    @Override
    public List<StockVO> getStockList() {
        return stockDao.selectStockList();
    }

    @Override
    public int insertStock(StockVO inputData) {
        return stockDao.insertStock(inputData);

        //js, jsp 호출부에서 return int 값으로 조건을 만들어 메세지를 띄워주지 않으려면..
        // public int 가 아니라 String 이나 Map으로 반환해서 성공 메시지까지 주기..
        //하단 update도 동일..
//        int resultValue = stockDao.insertStock(inputData);
//
//        if(resultValue > 0) {
//            //오류메세지. 정상적으로 저장되지 않았습니다. 하고 중간종료.
//        } else if(resultValue < 0) {
//            //성공메세지. 정상적으로 저장되었습니다..
//        }
//
//        return resultValue;
    }

    @Override
    public int updateStock(StockVO inputData) {
        return stockDao.updateStock(inputData);
    }
}