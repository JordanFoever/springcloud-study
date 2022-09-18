package com.wjiangquan.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author weijiangquan
 * @date 2022/9/17 -20:13
 * @Description
 */
@Configuration
public class ApplicationContestConfig {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
//application.xml  <bean id="" class> 上面就相当于这个,相当于在容器中有一个这样的对象,相当于将方法的返回值返回容器中


