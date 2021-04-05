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
      log.info("Preloading " + repository.save(new TestData("Bilbo")));
      log.info("Preloading " + repository.save(new TestData("Frodo")));
      log.info("Preloading " + repository.save(new TestData("Meriadoc")));
    };
  }
}