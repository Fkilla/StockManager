package dao;

import common.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import vo.StockVO;

import java.util.HashMap;
import java.util.List;

public class StockDaoImpl implements StockDao {

    @Override
    public Integer selectStockCnt() {
        try (SqlSession session =
                     MyBatisUtil.getFactory().openSession()) {

            return session.selectOne(
                    "dao.StockDao.selectStockCnt"
            );
        }
    }

    @Override
    public List<HashMap<String, Object>> selectStockListPaging(HashMap<String, Object> param) {
        try (SqlSession session =
                     MyBatisUtil.getFactory().openSession()) {

            return session.selectList(
                    "dao.StockDao.selectStockListPaging", param

            );
        }
    }


    @Override
    public List<StockVO> selectStockList() {

        try (SqlSession session =
                     MyBatisUtil.getFactory().openSession()) {

            return session.selectList(
                    "dao.StockDao.selectStockList"
            );
        }
    }

    @Override
    public int insertStock(StockVO inputData) {
        try (SqlSession session =
                     MyBatisUtil.getFactory().openSession()) {
            int result = session.insert(
                    "dao.StockDao.insertStock",
                    inputData
            );

            session.commit();
            return result;
        }
    }

    @Override
    public int updateStock(StockVO inputData) {
        try (SqlSession session =
                     MyBatisUtil.getFactory().openSession()) {
            int result = session.insert(
                    "dao.StockDao.updateStock",
                    inputData
            );

            session.commit();
            return result;
        }
    }
}