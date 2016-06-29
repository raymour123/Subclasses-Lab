/**
 * Created by raymour on 6/28/16.
 */
public class Cobra extends Reptile {
    private boolean poisonIsFatal;

    public Cobra() {
        super();
        poisonIsFatal = true;
    }

    public Cobra(int nLegs, int speed, boolean endanger, String name, boolean poison, boolean pfatal) {
        super();
        poisonIsFatal = pfatal;
    }

    public void printInfo() {
        super.printInfo();
        System.out.print("King Cobra: " + poisonIsFatal);
    }
}