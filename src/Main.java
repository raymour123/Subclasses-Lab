/**
 * Created by raymour on 6/28/16.
 */
public class Main {
    public static void main (String[] args){

        Animal outAnimal = new Animal(4, 20, false, "Animal");
        Mammal outMammal = new Mammal(4, 20, false, "Animal", false);
        Reptile outReptile = new Reptile(4, 20, false, "Animal", false);
        Frog outFrog = new Frog(4, 20, false, "Animal", false, false);
        Cobra outCobra = new Cobra(4, 20, false, "Animal", false, false);

        outAnimal.printInfo();
        System.out.println();

        outMammal.printInfo();
        System.out.println();

        outReptile.printInfo();
        System.out.println();

        outFrog.printInfo();
        System.out.println();

        outCobra.printInfo();
        System.out.println();
    }
}
