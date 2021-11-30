package oop;

/* Animal->Pet->Cat */
public class Cat extends Pet {

    private CatsBreed breed;
    private String furColor;

    public Cat(String name, Integer age, String sex, CatsBreed breed, String furColor) {
        setPetName(name);
        setAge(age);
        setSex(sex);
        setFurColor(furColor);
        setBreed(breed);
    }

    public CatsBreed getBreed() {
        return breed;
    }

    public void setBreed(CatsBreed breed) {
        this.breed = breed;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public void setAnimalClass() {
        this.setAnimalClass("Mammals");
    }

    public void sounds() {
        System.out.println("Meow, meow, I am a cat ");
    }

    @Override
    public String toString() {
        return String.format("Hello! My name is %s. I am %d years old, breed %s. I live in %s with my owner %s.%n" + (getBreed().getFurType().equals("hairless") ? "I am hairless!" : "My fur is %s %s!"),
                getPetName(), getAge(), getBreed().getBreedName(), getLocation().getCity(), getOwner(), getBreed().getFurType(), getFurColor());
    }
}
