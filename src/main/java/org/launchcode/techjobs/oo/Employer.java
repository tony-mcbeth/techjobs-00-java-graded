package org.launchcode.techjobs.oo;

import org.launchcode.techjobs.oo.test.JobField;

import java.util.Objects;

public class Employer extends JobField {
    public Employer(String value) {
        super(value);
    }
}

/*    private int id;
    private static int nextId = 1;
    private String value;

    public Employer() {
        id = nextId;
        nextId++;
    }

    public Employer(String value) {
        super(value);
    }

    static class JobField {
        private int id;
        private static int nextId = 1;
        private String value;


        public JobField() {
            this.id = nextId;
            nextId++;
        }
        public JobField(String value) {
            this();
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }
    //Objects with same id are equal
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            JobField jobField = (JobField) o;
            return id == jobField.id;
        }
        @Override
        public int hashCode() {
            return Objects.hash(getId());
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
    }

// Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }

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