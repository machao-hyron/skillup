package com.example.demo.runner;

import javax.sql.DataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.stereotype.Component;

/**
 * @author yangfeng
 * @version 1.0
 * @date 2022-05-27 11:30
 */
@Component
@Slf4j
public class CommandLineStartupRunner implements CommandLineRunner {
  @Autowired
  DataSource dataSource;

  @Override
  public void run(String... args) throws Exception {
//    PlanStartThread pt = new PlanStartThread();
//    new Thread(pt).start();
    log.info("执行sql建表语句");
    Resource resources = new ClassPathResource("dbdump.sql");
    ResourceDatabasePopulator resourceDatabasePopulator = new ResourceDatabasePopulator();
    resourceDatabasePopulator.addScripts(resources);
    resourceDatabasePopulator.execute(dataSource);
    log.info("建表语句执行完成");
  }
}

