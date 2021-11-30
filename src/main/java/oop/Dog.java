package oop;

import org.jetbrains.annotations.NotNull;

/* Animal->Pet->Dog */
public class Dog extends Pet {

    private Breed breed = new Breed();

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(@NotNull Breed breed) {
        this.breed = breed;
    }

    public void  setAnimalClass(){
        this.setAnimalClass("Mammals");
    }

    public void  sounds(){
        System.out.println( "I am a dog and I bark - Bau-Bau\n");
    }
    @Override
    public String toString(){
        return String.format("Hello! My name is %s. I am %d years old, breed %s. I live in %s with my owner %s.",
                getPetName(),getAge(), getBreed().getBreedName(),getLocation().getCity(), getOwner());
    }
}
