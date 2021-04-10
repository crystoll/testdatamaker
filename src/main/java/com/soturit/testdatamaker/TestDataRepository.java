package com.soturit.testdatamaker;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TestDataRepository extends CrudRepository<TestData, Long> {

    List<TestData> findAll();
    List<TestData> findAllByDataType(DataType dataType);

}
