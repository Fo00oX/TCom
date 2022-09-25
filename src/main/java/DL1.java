import calculators.DelayCalculator;
import calculators.DifferenceInPowerCalculator;

class Dl1 {

    public static void main(String[] args) {
        /**For the Calculation of Transmission delay:
         * insert the Transmission rate in Mbit/s and packet length in bits**/
        String transmissionDelay = DelayCalculator.transmissionDelayCalculator(100, 8000); //

        /**For the Calculation of Propagation delay:
         * insert the Distance in Kilometers and Propagation Speed in Microseconds**/
        String propagationDelay = DelayCalculator.propagationDelayCalculator(12,0.2);

        String differenceBetween = DifferenceInPowerCalculator.differenceInPower(10,15);

        System.out.println( "Transmission Delay is: " + transmissionDelay);
        System.out.println( "Propagation Delay is: " + propagationDelay);
        System.out.println( "The Difference is: " + differenceBetween);


    }
}
