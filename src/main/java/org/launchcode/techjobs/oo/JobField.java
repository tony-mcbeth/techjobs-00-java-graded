package org.launchcode.techjobs.oo;

        import java.util.Objects;

public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        this.id = nextId;
        nextId++;
    }
//constructor
    public JobField(String value) {
        this();
        this.value = value;
    }
//toString method
    @Override
    public String toString() {
        return this.value;
    }
//equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id;
    }
//hashCode method
    @Override
    public int hashCode() {

        return Objects.hash(id);
    }


    //the getters and setters
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