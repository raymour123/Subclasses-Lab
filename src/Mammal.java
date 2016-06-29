/**
 * Created by raymour on 6/28/16.
 */
public class Mammal extends Animal {
    private boolean amphibian;

    public Mammal(){
        super();
        amphibian = false;
    }
    public Mammal(int nLegs, int speed, boolean endanger, String name, boolean amphib){
        super();
        amphibian = amphib;
    }
    public void printInfo(){
        super.printInfo();
        System.out.print("Land Animals: " + amphibian);
            }

}
