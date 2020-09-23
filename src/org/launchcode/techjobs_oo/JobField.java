package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {
    int id;
    static int nextId = 1;
    String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value){
        this();
        this.value = value;
    }



    // Methods
    @Override
        // Two objects are equal if they have the same id.
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;   //casts o as a jobField object
        return getId() == jobField.getId();
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }





    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}