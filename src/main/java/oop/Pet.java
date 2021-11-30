package oop;

import org.jetbrains.annotations.NotNull;
/* Animal->Pet
    Address;
    owner;
    chipID
    sounds */
public class Pet extends Animal {
    private Address location = new Address(" "," ", " ");
    private String owner;
    private String chipID;

    public String getPetName() {
        return petName;
    }

    public void setPetName(@NotNull String petName) {
        if (!petName.isEmpty())
            this.petName = petName;
    }

    private String petName;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
         this.owner = owner;
    }

    public String getChipID() {
        return chipID;
    }

    public void setChipID(String chipID) {
        this.chipID = chipID;
    }

    public Address getLocation() {
        return location;
    }

    public void setLocation(Address location) {
        if (location != null)
         this.location = location;
    }

    public void sounds(String sound){
        System.out.println(sound);
    }


}
