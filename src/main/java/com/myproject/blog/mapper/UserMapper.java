package com.myproject.blog.mapper;

import com.myproject.blog.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhengkaiwen
 * @date 2022/8/16-16:02
 */
@Mapper
public interface UserMapper {

    User selectById(int id);

    User selectByName(String username);

    User selectByEmail(String email);

    int insertUser(User user);

    int updateStatus(int id, int status);

    int updateHeader(int id, String headerUrl);

    int updatePassword(int id, String password);

}
