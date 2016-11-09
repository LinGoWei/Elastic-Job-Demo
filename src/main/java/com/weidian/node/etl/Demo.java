package com.weidian.node.etl;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liuguowei on 11/9/16.
 */
@SpringBootApplication
public class Demo implements CommandLineRunner {

    /** main函数 */
    public static void main( String[] args )
    {
        SpringApplication.run(Demo.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    }
}
