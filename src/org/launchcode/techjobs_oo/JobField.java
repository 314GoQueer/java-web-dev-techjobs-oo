package org.launchcode.techjobs_oo;

import java.util.Objects;
//abstraction
abstract public class JobField {
    private int id;
    private static int nextId = 1;
    private String value;
public JobField(){
    id = nextId;
    nextId++;
}
public JobField(String value){
    this();
    this.value = value;
}

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id &&
                Objects.equals(value, jobField.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value);
    }
        public String toString() {
        return value;
    }
}
