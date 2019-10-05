package com.zx.mapper;

import com.zx.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userMapper")
public interface UserMapper {
    User getUser(long id);
    List<User> getUserByAnnotation(@Param("nickName") String nickname);
    User getUserByResultMap(@Param("id") long id);
}
