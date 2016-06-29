/**
 * Created by raymour on 6/28/16.
 */
public class Frog extends Mammal {
    private boolean breathUnderWater;

    public Frog() {
        super();
        breathUnderWater = false;
    }

    public Frog(int nLegs, int speed, boolean endanger, String name, boolean amphib, boolean undrwatr) {
        super();
        breathUnderWater = undrwatr;
    }

    public void printInfo() {
        super.printInfo();
        System.out.print("Prince Frog " + breathUnderWater);
    }
}
