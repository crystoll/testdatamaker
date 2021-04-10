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
      log.info("Preloading " + repository.save(new TestData("Aragorn",DataType.FIRST_NAME)));
      log.info("Preloading " + repository.save(new TestData("Gandalf",DataType.FIRST_NAME)));
      log.info("Preloading " + repository.save(new TestData("Tom",DataType.FIRST_NAME)));
      log.info("Preloading " + repository.save(new TestData("Galadriel",DataType.FIRST_NAME)));
      log.info("Preloading " + repository.save(new TestData("Arwen",DataType.FIRST_NAME)));
      log.info("Preloading " + repository.save(new TestData("Gollum",DataType.FIRST_NAME)));
      log.info("Preloading " + repository.save(new TestData("Legolas",DataType.FIRST_NAME)));
      log.info("Preloading " + repository.save(new TestData("Hasufel",DataType.FIRST_NAME)));
      log.info("Preloading " + repository.save(new TestData("Sam",DataType.FIRST_NAME)));
      log.info("Preloading " + repository.save(new TestData("Beregond",DataType.FIRST_NAME)));
      log.info("Preloading " + repository.save(new TestData("Boromir",DataType.FIRST_NAME)));
      log.info("Preloading " + repository.save(new TestData("Celeborn",DataType.FIRST_NAME)));
      log.info("Preloading " + repository.save(new TestData("Saruman",DataType.FIRST_NAME)));
      log.info("Preloading " + repository.save(new TestData("Elrond",DataType.FIRST_NAME)));
      log.info("Preloading " + repository.save(new TestData("Éomer",DataType.FIRST_NAME)));
      log.info("Preloading " + repository.save(new TestData("Éowyn",DataType.FIRST_NAME)));
      log.info("Preloading " + repository.save(new TestData("Théoden",DataType.FIRST_NAME)));
      log.info("Preloading " + repository.save(new TestData("Peregrin",DataType.FIRST_NAME)));
      log.info("Preloading " + repository.save(new TestData("Galadriel",DataType.FIRST_NAME)));
      log.info("Preloading " + repository.save(new TestData("Gimli",DataType.FIRST_NAME)));

      log.info("Preloading " + repository.save(new TestData("Baggins",DataType.LAST_NAME)));
      log.info("Preloading " + repository.save(new TestData("Gamgee",DataType.LAST_NAME)));
      log.info("Preloading " + repository.save(new TestData("Il Elessar",DataType.LAST_NAME)));
      log.info("Preloading " + repository.save(new TestData("Bolger",DataType.LAST_NAME)));
      log.info("Preloading " + repository.save(new TestData("Bombadil",DataType.LAST_NAME)));
      log.info("Preloading " + repository.save(new TestData("Brandybuck",DataType.LAST_NAME)));
      log.info("Preloading " + repository.save(new TestData("Butterbur",DataType.LAST_NAME)));
      log.info("Preloading " + repository.save(new TestData("Inglorion",DataType.LAST_NAME)));
      log.info("Preloading " + repository.save(new TestData("Took",DataType.LAST_NAME)));
    };
  }
}