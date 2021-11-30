package oop;
/*Cat Breeds*/
public enum CatsBreed {
    EUROPEAN("European", "short hair"),
    BRITISHLONGHAIR("British Longhair", "semi-long hair"),
    MAINECOON("Maine Coon", "Semi-longsemi-long hair"),
    SPHYNX("Sphynx", "hairless");

    private final String breedName;
    private final String furType;

    CatsBreed(String breedName, String furType) {
        this.breedName = breedName;
        this.furType = furType;
    }

    public String getBreedName() {
        return breedName;
    }

    public String getFurType() {
        return furType;
    }

}


