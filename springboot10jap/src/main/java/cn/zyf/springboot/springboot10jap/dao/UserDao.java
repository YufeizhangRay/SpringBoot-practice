package cn.zyf.springboot.springboot10jap.dao;

import cn.zyf.springboot.springboot10jap.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
}
