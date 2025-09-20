import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MybatisUtils {
    private static SqlSessionFactory factory;

    static{
        try{
            factory=new SqlSessionFactoryBuilder().build(new FileInputStream("mybatis-config.xml"));
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public static SqlSession openSession(boolean autoCommit){
        return factory.openSession(autoCommit);
    }
}
