package com.weidian.node.etl.check;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * Created by liuguowei on 11/9/16.
 */
public class MyElasticJob2 implements SimpleJob {

    private static final Logger logger = LoggerFactory.getLogger(MyElasticJob2.class);

    @Override
    public void execute(ShardingContext context) {
        Date date = new Date();
        System.out.println("Hello world!" + date);
        logger.info("Hello world!" + date);
    }
}
