import org.junit.jupiter.api.Test;
import sun.rmi.runtime.Log;

import static org.junit.jupiter.api.Assertions.*;

class SASTest {

    @Test
    void calculImpot() {
        SAS sas = new SAS();
        assertEquals(sas.calculImpot(100),33);
    }
}