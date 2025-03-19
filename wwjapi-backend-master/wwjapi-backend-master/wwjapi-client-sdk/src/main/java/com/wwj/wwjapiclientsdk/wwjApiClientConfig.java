package com.wwj.wwjapiclientsdk;

import com.wwj.wwjapiclientsdk.client.wwjApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * wwjApi客户端配置
 */
@Configuration
@ConfigurationProperties("wwjapi.client")
@Data
@ComponentScan
public class wwjApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public wwjApiClient wwjApiClient() {
        return new wwjApiClient(accessKey, secretKey);
    }

}
