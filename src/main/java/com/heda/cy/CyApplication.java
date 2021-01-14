package com.heda.cy;

import com.github.pagehelper.PageHelper;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.omg.PortableInterceptor.Interceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;

@SpringBootApplication
@MapperScan("com.heda.cy.*.mapper")
@EnableTransactionManagement
public class CyApplication {

    public static void main(String[] args) {
        SpringApplication.run(CyApplication.class, args);
    }

}
