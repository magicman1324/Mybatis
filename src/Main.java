import com.test.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

public class Main{
    public static void main(String[] args) throws Exception {
        try(SqlSession session=MybatisUtils.openSession(true)){
            List<User> users = session.selectList("selectUserByAge",18 );
            users.forEach(System.out::println);
        }

    }
}

