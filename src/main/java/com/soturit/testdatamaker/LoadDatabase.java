package com.soturit.testdatamaker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(TestDataRepository repository) {

    return args -> {
      log.info("Preloading " + repository.save(new TestData("Bilbo",DataType.FIRST_NAME)));
      log.info("Preloading " + repository.save(new TestData("Frodo",DataType.FIRST_NAME)));
      log.info("Preloading " + repository.save(new TestData("Meriadoc",DataType.FIRST_NAME)));
      log.info("Preloading " + repository.save(new TestData("Baggins",DataType.LAST_NAME)));
    };
  }
}