package coms.dao;

import coms.beans.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("UserDao")
@Mapper
public interface UserDao {
    public User getUser(@Param("userName") String userName, @Param("password") String password);
    public int InsertUser(User user);
}
