package cn.zyf.springboot.springboot9druid;

import cn.zyf.springboot.springboot9druid.dao.UserDao;
import cn.zyf.springboot.springboot9druid.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot9druidApplicationTests {

    @Autowired
    private UserDao userDao;

    @Autowired
    private DataSource dataSource;

    @Test
    public void contextLoads() {

//        System.out.println(dataSource.getClass());
//        System.out.println(userDao.getClass());

//        User user = new User();
////        user.setUsername("Ray");
////        user.setPassword("666666");
////        userDao.add(user);

//        userDao.delete(1);

        User user = userDao.get(2);
        System.out.println(user);
        user.setPassword("777");
        userDao.update(user);
        User user1 = userDao.get(2);
        System.out.println(user1);
    }

}
