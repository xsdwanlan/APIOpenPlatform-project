package com.wwj.wwjapiinterface;

import com.wwj.wwjApiClientsdk.client.wwjApiClient;
import com.wwj.wwjApiClientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * 测试类
 *
 *   
 *    
 */
@SpringBootTest
class wwjapiInterfaceApplicationTests {

    @Resource
    private wwjApiClient wwjApiClient;

    @Test
    void contextLoads() {
        String result = wwjApiClient.getNameByGet("wwj");
        User user = new User();
        user.setUsername("wwj");
        String usernameByPost = wwjApiClient.getUsernameByPost(user);
        System.out.println(result);
        System.out.println(usernameByPost);
    }

}
