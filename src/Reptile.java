/**
 * Created by raymour on 6/28/16.
 */
public class Reptile extends Animal {
    private boolean isPoisonous;

    public Reptile() {
        super();
        isPoisonous = false;
    }

    public Reptile(int nLegs, int speed, boolean endanger, String name, boolean poison) {
        super();
        isPoisonous = poison;
    }

    public void printInfo() {
        super.printInfo();
        System.out.print("Reptilia: " + isPoisonous);
    }
}

