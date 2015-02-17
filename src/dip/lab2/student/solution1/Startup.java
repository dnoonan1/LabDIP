package dip.lab2.student.solution1;

/**
 *
 * @author dnoonan1
 */
public class Startup {
    
    public static void main(String[] args) {
        TipService service = new TipService();
        service.setStrategy(new RestaurantTipStrategy(10.00, 0.20));
        System.out.printf("Restaurant Tip = $%.2f\n", service.calculateTip());
        service.setStrategy(new BaggageTipStrategy(5, 1.00, 2.0));
        System.out.printf("Baggage Tip = $%.2f\n", service.calculateTip());
    }
    
}
