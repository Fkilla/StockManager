package common;

import org.apache.ibatis.session.SqlSession;

import java.sql.Connection;

public class DbTest {

    public static void main(String[] args) {

        try (SqlSession session =
                     MyBatisUtil.getFactory().openSession()) {

            Connection conn = session.getConnection();

            System.out.println("DB 연결 성공!");
            System.out.println("DB 정보: "
                    + conn.getMetaData().getURL());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}