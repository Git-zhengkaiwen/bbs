package com.myproject.blog;

import com.myproject.blog.mapper.DiscussPostMapper;
import com.myproject.blog.mapper.UserMapper;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author zhengkaiwen
 * @date 2022/8/16-16:11
 */
@SpringBootTest
public class MapperTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private DiscussPostMapper discussPostMapper;
    @Test
    public void testSelect(){
        int rows = discussPostMapper.selectDiscussPostRows(149);
        System.out.println(rows);
    }
}
