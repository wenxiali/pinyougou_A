package com.cssl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan(basePackages="com.cssl.dao")
@EnableTransactionManagement
@SpringBootApplication
//(exclude = {DataSourceAutoConfiguration.class})
public class DemoApplication {



    public static void main(String[] args) throws Exception {

        SpringApplication.run(DemoApplication.class,args);
    }
}
