package dip.lab2.student.solution1;

/**
 *
 * @author dnoonan1
 */
public class TipService {
    
    private TipStrategy strategy;
    
    public TipService() {}

    public TipService(TipStrategy strategy) {
        this.strategy = strategy;
    }

    public TipStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(TipStrategy strategy) {
        this.strategy = strategy;
    }
    
    public double calculateTip() {
        return strategy.calculateTip();
    }
    
}
