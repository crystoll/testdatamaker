package com.soturit.testdatamaker;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import com.opencsv.CSVReaderHeaderAware;
import com.opencsv.exceptions.CsvException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;




@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(TestDataRepository repository) {

    return args -> {
      
      var lastNames = loadTestDataFromCSV("lastnames.csv",DataType.LAST_NAME);
      // lastNames.forEach(v -> log.info("Preloading " + repository.save(v)));
      lastNames.forEach(v -> repository.save(v));
      
      var maleFirstNames = loadTestDataFromCSV("male_firstnames.csv",DataType.FIRST_NAME);
      maleFirstNames.forEach(v -> repository.save(v));
      // maleFirstNames.forEach(v -> log.info("Preloading " + repository.save(v)));

      var femaleFirstNames = loadTestDataFromCSV("female_firstnames.csv",DataType.FIRST_NAME);
      femaleFirstNames.forEach(v -> repository.save(v));
      // femaleFirstNames.forEach(v -> log.info("Preloading " + repository.save(v)));

      log.info("Preloaded a bunch of data from csv files, ready to serve.");
    };
  }

  private List<TestData> loadTestDataFromCSV(String fileName, DataType dataType) throws FileNotFoundException, IOException, CsvException {
    var lastNamesFile = new ClassPathResource(fileName);
    try (var csvFileReader = new CSVReaderHeaderAware(new BufferedReader(new InputStreamReader(lastNamesFile.getInputStream())))) {
      var allRows = csvFileReader.readAll();
      log.info("Loaded " + allRows.size() + " rows from csv");
      var lastNamesTestData = allRows.stream().
        map(v -> new TestData(v[0],dataType))
        .collect(Collectors.toList());
      log.info("Converted " + lastNamesTestData.size() + " rows from csv");          
      return lastNamesTestData;
    }
 
  }
}