package common;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {

    private static final SqlSessionFactory factory;

    static {
        try {
            InputStream input =
                    Resources.getResourceAsStream("mybatis-config.xml");

            factory = new SqlSessionFactoryBuilder()
                    .build(input);

        } catch (Exception e) {
            throw new RuntimeException(
                    "MyBatis 설정 및 DB 연결 설정을 확인하세요.", e
            );
        }
    }

    public static SqlSessionFactory getFactory() {
        return factory;
    }
}