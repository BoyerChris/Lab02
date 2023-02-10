import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    SalaryWorker person4;

    @BeforeEach
    void setUp() {
        person4 = new SalaryWorker("Winston", "Level", "Mr", "000004", 1984, 0, 39000);
    }

    @Test
    void setAnnualSalary() {
        person4.setAnnualSalary(52000);
        assertEquals(52000, person4.getAnnualSalary());
    }

    @Test
    void setWeeksPay() {
        person4.setWeeksPay(1000);
        assertEquals(1000, person4.getWeeksPay());
    }

    @ParameterizedTest
    @ValueSource(doubles = 40)
    void displayWeeklyPay(double weeklyHours) {
        person4.setWeeksPay(208.0);
        assertEquals("1 Week's pay: 208.0", person4.displayWeeklyPay(40));
    }

    @ParameterizedTest
    @ValueSource(doubles = 40)
    void calculateWeeklyPay(double weeklyHours) {
        person4.setAnnualSalary(10816);
        assertEquals(208.0, person4.calculateWeeklyPay(40));
    }

}