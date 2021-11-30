package oop;
/* Dog breeds
Contains breed name
 */
public class Breed {
    private String breedName;

    public String getBreedName() {
        return breedName;
    }

    public void setBreedName(String breedName) {
        if (!breedName.isEmpty())
            this.breedName = breedName;
    }
}
