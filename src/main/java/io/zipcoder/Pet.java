package io.zipcoder;

public abstract class Pet {
    String petName = "Bob";
    public abstract String speak();

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }
}

