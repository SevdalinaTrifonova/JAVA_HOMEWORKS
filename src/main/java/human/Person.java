package human;

import animal.Mammal;

public class Person extends Mammal {
    public Person( String name){
        super(name);
    }
    void eat2(String food){
        super.eat(food);
    }
}
