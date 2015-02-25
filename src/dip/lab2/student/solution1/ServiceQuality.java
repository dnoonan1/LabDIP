package dip.lab2.student.solution1;

/**
 *
 * @author dnoonan1
 */
/*public enum ServiceQuality {
    HORRIBLE, POOR, STANDARD, GOOD, EXCELLENT
}*/

public enum ServiceQuality {
    
    TERRIBLE(0.00), FAIR(0.10), GOOD(0.15), GREAT(0.20);
    
    private double percent;
    
    ServiceQuality(double percent) {
        this.percent = percent;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
    
}
