package oop;

import org.jetbrains.annotations.NotNull;
/* Common animal class
Contains age;
         amimalClass;
         sex;
         eat();
 */
public class Animal {

    private int age;
    private String animalClass;
    private String sex;

    public String getAnimalClass() {
        return animalClass;
    }

    public void setAnimalClass(@NotNull String animalClass) {
        if (!animalClass.isEmpty())
            this.animalClass = animalClass;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(@NotNull String sex) {
        if (!sex.isEmpty())
            this.sex = sex;
    }

    public void eat(String food) {
        System.out.println("My favourite food is " + food);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0)
            this.age = age;
    }

}
