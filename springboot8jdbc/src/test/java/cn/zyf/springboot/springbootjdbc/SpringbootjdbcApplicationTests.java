package cn.zyf.springboot.springbootjdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.Map;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootjdbcApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Test
    public void contextLoads() throws Exception{
        System.out.println(dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        List<Map<String,Object>> maps = jdbcTemplate.queryForList("select * from test_user");
        System.out.println(maps);
        connection.close();
    }

}
