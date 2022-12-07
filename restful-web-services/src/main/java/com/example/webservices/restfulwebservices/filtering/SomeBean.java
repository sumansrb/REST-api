package com.example.webservices.restfulwebservices.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
import net.minidev.json.annotate.JsonIgnore;

@JsonFilter("SomeBeanFilter")
public class SomeBean {
    private String field1;
    private String field2;
    private String field3;

    @Override
    public String toString() {
        return super.toString();
    }

    public String getField1() {
        return field1;
    }

    public String getField3() {
        return field3;
    }

    public String getField2() {
        return field2;
    }

    public SomeBean(String field1, String field2, String field3) {
        super();
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }
}
