import com.test.entity.User;
import com.test.mapper.TestMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Main{
    public static void main(String[] args) throws Exception {
        try(SqlSession session=MybatisUtils.openSession(true)){
            TestMapper mapper = session.getMapper(TestMapper.class);
    //            User user = mapper.selectUserById(1);
    //            user.setAge(20);
    //            mapper.setUserAgeById(user);
            mapper.deleteUserById(1);
        }

    }
}

