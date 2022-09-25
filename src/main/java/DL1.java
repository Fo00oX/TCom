import java.text.DecimalFormat;
import java.text.NumberFormat;

class Dl1 {

    static NumberFormat formatter = new DecimalFormat("###.##################");

    public static String transmissionDelayCalculator( Integer transmissionRate, Integer packetLengthInBits ){

        double transmissionDelay;

        transmissionDelay = packetLengthInBits/(transmissionRate * Math.pow(10, 6));

        double transmissionDelayInMilliseconds = transmissionDelay * 10000;

        String transmissionDelayInDecimalToString = formatter.format(transmissionDelayInMilliseconds);

        return transmissionDelayInDecimalToString + " Microseconds";
    }

    public static String propagationDelayCalculator(Integer distance, Double propagationSpeed){

        double propagationDelay;

        propagationDelay = (((distance * Math.pow(10, 3))) / (propagationSpeed * Math.pow(10, 8)));

        double propagationDelayInMilliseconds = propagationDelay * 1000;

        String transmissionDelayInDecimalToString = formatter.format(propagationDelayInMilliseconds);

        return transmissionDelayInDecimalToString + " Microseconds";
    }

    public static void main(String[] args) {
        /**For the Calculation of Transmission delay:
         * insert the Transmission rate in Mbit/s and packet length in bits**/
        String transmissionDelay = Dl1.transmissionDelayCalculator(1000, 1500); //

        /**For the Calculation of Propagation delay:
         * insert the Distance in Kilometers and Propagation Speed in Microseconds**/
        String propagationDelay = Dl1.propagationDelayCalculator(40,0.2);

        System.out.println( "Transmission Delay is: " + transmissionDelay);
        System.out.println( "Propagation Delay is: " + propagationDelay);

    }
}
