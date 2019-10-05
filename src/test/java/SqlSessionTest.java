import com.zx.bean.DataSourceBean;
//import com.zx.config.ApplicationConfig;
import com.zx.config.RootConfig;
import com.zx.config.WebInitializer;
import com.zx.mapper.UserMapper;
import com.zx.pojo.User;
import com.zx.util.SqlSessionFactoryUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.jdbc.Sql;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class SqlSessionTest {

    @Test
    public void mapperSqlTest(){
        // CodeUtils.decode(str)  // 解密
        Logger log = Logger.getLogger(SqlSessionTest.class);
        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUser(7L);
        System.out.println(user);
        SqlSessionFactoryUtil.closeSqlSession(sqlSession);
    }

    @Test
    public void getUserByAnnotationTest(){
        Logger log = Logger.getLogger(SqlSessionTest.class);
        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = userMapper.getUserByAnnotation("品怡");
        System.out.println(list.size());
        SqlSessionFactoryUtil.closeSqlSession(sqlSession);
    }

    @Test
    public void getUserByResultMapTest(){
        Logger log = Logger.getLogger(SqlSessionTest.class);
        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserByResultMap(7L);
        System.out.println(user);
        SqlSessionFactoryUtil.closeSqlSession(sqlSession);
    }

    @Test
    public void annotationTest(){
        // 进行容器的初始化
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(RootConfig.class);
        String url = ctx.getEnvironment().getProperty("jdbc.database.url");
        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        System.out.println(dataSource);
        ctx.close();
    }

    @Test
    public void annotationGetMapperTest(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(RootConfig.class);
        UserMapper userMapper = (UserMapper) ctx.getBean("userMapper");
        User user = userMapper.getUser(7L);
        System.out.println(user);
        ctx.close();
    }

}
