public class rocketequation {
    public static void main(String[] args) {
        Double finalVelocity = calculateResultantVelocity();
        System.out.println("Final Resultant Velocity: " + finalVelocity);
    }

    public static Double calculateResultantVelocity() {
        double resultantVelocity = 0;
        double rockEjectionVelocity = 1.0;  // velocity at which rocks are ejected
        int remainingRocks = 10;  // initial number of rocks
        
        // Each iteration represents ejecting one rock
        while (remainingRocks != 0) {  // stop when only one rock left
            // Calculate recoil using conservation of momentum
            double massRatio = rockEjectionVelocity / (remainingRocks - 1);
            resultantVelocity += massRatio;  // accumulate the recoil velocity
            remainingRocks--;  // one less rock for next iteration
            
            System.out.println("After ejecting rock " + (10 - remainingRocks) + 
                             ": Velocity = " + resultantVelocity);
        }
        
        return resultantVelocity;
    }     
}
    

