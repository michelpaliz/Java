package libs;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class format {

    public static double withBigDecimal(double value, int places) {
        BigDecimal bigDecimal = new BigDecimal(value);
        bigDecimal = bigDecimal.setScale(places, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }

    // double D = 4.2352989244d;
    // assertThat(withBigDecimal(D, 2)).isEqualTo(4.24);
    // assertThat(withBigDecimal(D, 3)).isEqualTo(4.235);

}
