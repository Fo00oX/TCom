package calculators;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DelayCalculator {

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
}
