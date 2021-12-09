package encapsulation;

import org.jetbrains.annotations.NotNull;
import java.util.Scanner;

public class Shopper {
    public static void main(String[] args) {
        String divider="____________________________________________";
        Person elena= new Person("Elena",11.00);
        Person alex=new Person("Alex", 4.0);
        Product coffee=new Product("Coffee",10.00);
        Product tea=new Product("Tea",2.00);
        elena.buyProduct(coffee);
        alex.buyProduct(tea);
        alex.buyProduct(tea);
        elena.buyProduct(tea);
        elena.printShoppingBag();
        alex.printShoppingBag();
        System.out.println(divider);

        Person mimi= new Person("Mimi",0.00);
        Product juice=new Product("Juice",2.00);
        mimi.buyProduct(juice);
        mimi.printShoppingBag();
        System.out.println(divider);

        Person petar= new Person("Petar",-3.00);
        Product bread=new Product("Bread",1.00);
        petar.buyProduct(bread);
        petar.printShoppingBag();
        System.out.println(divider);

        Scanner scn = new Scanner(System.in);
        System.out.println("Input persons and their money in format [Person]=[Money];");
        String buyersStr= scn.nextLine();
        System.out.println("Input products and their costs in format [Product]=[Cost];");
        String productStr=scn.nextLine();
        Person [] buyers = parsePeople(buyersStr);
        if (!correctPerson(buyers)){
            return;
        }
        Product [] product = parseProduct(productStr);
        if (!correctProduct(product)){
            return;
        }
        String[] tmp;
        System.out.println("Input a buy actions in format [PersonName] [ProductName], for end write END");
        String commandStr="";
        while ((!commandStr.equals("END"))) {
           commandStr=scn.nextLine();
           tmp = commandStr.split(" ");
           if (tmp.length >= 2) {
               int idxPerson = findIndexByName(buyers, tmp[0]);
               int idxProduct = findIndexByName(product, tmp[1]);
               if (idxPerson < 0)
                   System.out.printf("Unknown person %s%n", tmp[0]);
               if (idxProduct < 0)
                   System.out.printf("Unknown product %s%n", tmp[1]);
               if ((idxPerson >= 0) && (idxProduct >= 0))
                   buyers[idxPerson].buyProduct(product[idxProduct]);
           }
        }
        printPersons(buyers);
    }

    public static Person @NotNull [] parsePeople(@NotNull String peopleStr) {
        String [] persons=peopleStr.split(";");
        Person [] personTmp = new Person[persons.length];
        for (int i=0; i<persons.length; i++){
            String []  tmp=persons[i].split("=");
            personTmp[i] = new Person(tmp[0],Double.parseDouble(tmp[1]));
        }
        return personTmp;
    }

    public static Product @NotNull [] parseProduct(@NotNull String productStr) {
        String [] products=productStr.split(";");
        Product [] productTmp = new Product[products.length];
        for (int i=0; i<products.length; i++){
            String []  tmp=products[i].split("=");
            productTmp[i] = new Product(tmp[0],Double.parseDouble(tmp[1]));
        }
        return productTmp;
    }
    public static int findIndexByName(Person @NotNull [] person, String value){
        for (int i=0;i<person.length;i++){
            if (person[i].getName().equals(value)){
                return i;
            }
        }
        return -1;
    }
    public static int findIndexByName(Product @NotNull [] product, String value){
        for (int i=0;i<product.length;i++){
            if (product[i].getName().equals(value)){
                return i;
            }
        }
        return -1;
    }

    public static void printPersons(Person @NotNull [] person){
        for (Person buyer:
             person) {
          buyer.printShoppingBag();
        }
    }


    public static boolean correctPerson(Person @NotNull []person){
        for (Person buyer : person) {
            if (buyer.hasError())
                return false;
        }
        return true;
    }
    public static boolean correctProduct(Product @NotNull [] products){

        for (Product product : products) {
            if (product.hasError())
                return false;
        }
        return true;
    }

}
