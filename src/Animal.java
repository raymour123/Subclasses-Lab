/**
 * Created by raymour on 6/28/16.
 */
public class Animal {
    private int mNumLegs;
    private int mTopSpeed;
    private boolean mIsEndangered;
    private String mName;

    public Animal() {
        mNumLegs = 0;
        mTopSpeed = 0;
        mIsEndangered = false;
        mName = "Unknown";
    }

    public Animal(int nLegs, int speed, boolean endanger, String name) {
        mNumLegs = nLegs;
        mTopSpeed = speed;
        mIsEndangered = endanger;
        mName = name;
    }

    public void printInfo() {
        System.out.print(" [#Legs:] " + mNumLegs + " [Top Speed:] " + mTopSpeed + " [Endangered Status:] " + mIsEndangered + "[Name:] " + mName);
    }
}