package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Location  extends JobField {

    public Location(String value) {
        super(value);
    }

}

/*    private int id;
    private static int nextId = 1;
    private String value;

    public Location() {
       id = nextiId;
       nextId++;
    }

    // TODO: Add a constructor that takes a string as a parameter and assigns it to the 'value' field. The

//toString
    @Override
    public String toString() {
        return value;
    }
//equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return getId() == location.getId();
    }
//hashcode
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

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
*/