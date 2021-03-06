package com.soturit.testdatamaker;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class TestData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String data;
    
    @Enumerated(EnumType.STRING)
    private DataType dataType;


    public TestData() {
    }

    public TestData(String data, DataType dataType) {
        this.data = data;
        this.dataType = dataType;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public DataType getDataType() {
        return this.dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public TestData id(Long id) {
        setId(id);
        return this;
    }

    public TestData data(String data) {
        setData(data);
        return this;
    }

    public TestData dataType(DataType dataType) {
        setDataType(dataType);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TestData)) {
            return false;
        }
        TestData testData = (TestData) o;
        return Objects.equals(id, testData.id) && Objects.equals(data, testData.data) && Objects.equals(dataType, testData.dataType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, data, dataType);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", data='" + getData() + "'" +
            ", dataType='" + getDataType() + "'" +
            "}";
    }
  

}