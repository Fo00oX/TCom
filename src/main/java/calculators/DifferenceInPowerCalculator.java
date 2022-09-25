package calculators;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DifferenceInPowerCalculator {

    static NumberFormat formatter = new DecimalFormat("#####.##");

    public static String differenceInPower(Integer powerSignalInMW1, Integer powerSignalInMW2){

        double dBm1 = (Math.log10( powerSignalInMW1 ));
        double dBm2 = (Math.log10( powerSignalInMW2 ));

        double difference = dBm1 - dBm2;

        return formatter.format(difference);
    }
}
