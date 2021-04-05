package com.soturit.testdatamaker;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TestData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String data;

    public TestData() {
    }

    public TestData(String data) {
        this.data = data;
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

    public TestData id(Long id) {
        setId(id);
        return this;
    }

    public TestData data(String data) {
        setData(data);
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
        return Objects.equals(id, testData.id) && Objects.equals(data, testData.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, data);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", data='" + getData() + "'" + "}";
    }

}