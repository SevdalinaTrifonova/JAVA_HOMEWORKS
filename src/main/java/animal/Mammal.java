package animal;

public class Mammal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Mammal(String name) {
        setName(name);
    }

    public void eat(String food){
        System.out.printf("%s eats %s%n",this.name,food);
    }

}

