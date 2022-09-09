package com.myproject.blog;

import com.myproject.blog.util.SensitiveFilter;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author zhengkaiwen
 * @date 2022/8/18-19:11
 */
@SpringBootTest
public class SensitiveTest {
    @Autowired
    private SensitiveFilter sensitiveFilter;

    @Test
    public void testSensitive(){
        System.out.println("可口可乐很可口");
        System.out.println(sensitiveFilter.filter("可口可乐很可口"));
    }
}
