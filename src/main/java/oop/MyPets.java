package oop;

public class MyPets {
    public static void main(String[] args) {
        Address petsAddress=new Address("Varna", "Gen Kolev 85","Bulgaria");
        String owner = "Sevdalina Trifonova";

        Breed breed=new Breed();
        breed.setBreedName("Labrador Retriever");
        Dog puppy = new Dog();
        puppy.setPetName("Jojo");
        puppy.setAge(1);
        puppy.setSex("male");
        puppy.setLocation(petsAddress);
        puppy.setChipID("123456789");
        puppy.setOwner(owner);
        puppy.setBreed(breed);

        System.out.println(puppy);
        puppy.eat("chicken meat and big bones");
        puppy.sounds();


        Cat kitten = new Cat("Noah", 6,"male",CatsBreed.SPHYNX,"");
        kitten.setLocation(petsAddress);
        kitten.setChipID("123456119");
        kitten.setOwner(owner);

        System.out.println(kitten);
        kitten.eat("chicken meat and pouches");
        kitten.sounds();


    }
}
