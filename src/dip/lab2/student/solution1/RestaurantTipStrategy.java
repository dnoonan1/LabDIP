package dip.lab2.student.solution1;

/**
 *
 * @author dnoonan1
 */
public class RestaurantTipStrategy implements TipStrategy {
    
    private double total;
    private double percentTip;
    
    private static double STANDARD_TIP = 0.15;
    
    public RestaurantTipStrategy(double total) {
        setTotal(total);
        setPercentTip(STANDARD_TIP);
    }

    public RestaurantTipStrategy(double total, double percentTip) {
        setTotal(total);
        setPercentTip(percentTip);
    }
    
    public RestaurantTipStrategy(double total, ServiceQuality quality) {
        setTotal(total);
        switch (quality) {
            case HORRIBLE:
                percentTip = 0.00;
            case POOR:
                percentTip = 0.10;
            case STANDARD:
                percentTip = 0.15;
            case GOOD:
                percentTip = 0.20;
            case EXCELLENT:
                percentTip = 0.25;
        }
    }
    
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        if (total < 0.0) {
            throw new IllegalArgumentException();
        }
        this.total = total;
    }

    public double getPercentTip() {
        return percentTip;
    }

    public void setPercentTip(double percentTip) {
        if (percentTip < 0.0) {
            throw new IllegalArgumentException();
        }
        this.percentTip = percentTip;
    }
    
    @Override
    public double calculateTip() {
      return total * percentTip;
    }
    
}
