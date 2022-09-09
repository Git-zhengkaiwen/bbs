package com.myproject.blog;

import com.myproject.blog.util.MailClient;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

/**
 * @author zhengkaiwen
 * @date 2022/8/17-13:21
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = MyprojectApplication.class)
public class MailTest {

    @Autowired
    private MailClient mailClient;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private TemplateEngine templateEngine;




    @Test
    public void testHtml(){
        Context context = new Context();
        context.setVariable("username", "sunday");
        String content = templateEngine.process("mail/demo", context);
        mailClient.sendMail("821114016@qq.com", "HTML", content);
    }


    @Test
    public void testLogger(){
        log.info("打印内容{}",1);
    }

    @Autowired
    private Scheduler scheduler;

    @Test
    public void testDeleteJob() {
        try {
            boolean result = scheduler.deleteJob(new JobKey("postScoreRefreshJob", "communityJobGroup"));
            System.out.println(result);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}
