package dip.lab2.student.solution1;

/**
 *
 * @author dnoonan1
 */
public class BaggageTipStrategy implements TipStrategy {

    private int numBags;
    private double tipPerBag;
    private double multiplier;

    public BaggageTipStrategy(int numBags, double tipPerBag,
            double multiplier) {
        this.numBags = numBags;
        this.tipPerBag = tipPerBag;
        this.multiplier = multiplier;
    }

    public int getNumBags() {
        return numBags;
    }

    public void setNumBags(int numBags) {
        if (numBags < 0) {
            throw new IllegalArgumentException();
        }
        this.numBags = numBags;
    }

    public double getTipPerBag() {
        return tipPerBag;
    }

    public void setTipPerBag(double tipPerBag) {
        if (tipPerBag < 0.0) {
            throw new IllegalArgumentException();
        }
        this.tipPerBag = tipPerBag;
    }

    public double getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(double multiplier) {
        if (multiplier < 0.0) {
            throw new IllegalArgumentException();
        }
        this.multiplier = multiplier;
    }
    
    @Override
    public double calculateTip() {
        return numBags * tipPerBag * multiplier;
    }
     
}
