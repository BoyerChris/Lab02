import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    Worker person1;


    @BeforeEach
    void setUp() {
        person1 = new Worker("Chris", "Boyer", "Mr", "000001", 2002, 18.5);
    }

    @Test
    void setHourlyPayRate() {
        person1.setHourlyPayRate(5.2);
        assertEquals(5.2, person1.getHourlyPayRate());

    }

    @Test
    void setWeeksPay() {
        person1.setWeeksPay(260);
        assertEquals(260, person1.getWeeksPay());

    }
    @ParameterizedTest
    @ValueSource(doubles = 40)
    void displayWeeklyPay(double weeklyHours) {
        person1.setHourlyPayRate(5.2);
        person1.setWeeksPay(208.0);
        assertEquals("Regular Pay: 208.0, Overtime Pay: 0, Overall Pay: 208.0", person1.displayWeeklyPay(40));
    }

    @ParameterizedTest
    @ValueSource(doubles = 40)
    void calculateWeeklyPay(double weeklyHours) {
        person1.setHourlyPayRate(5.2);
        assertEquals(208.0, person1.calculateWeeklyPay(40));
    }

}