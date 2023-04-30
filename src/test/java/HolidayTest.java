package ru.netology.service;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HolidayTest {
    @Test
    void calculateRestMonthsShouldReturnCorrectValue() {
        Holiday service = new Holiday();

        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;

        int restMonths = service.calculateRestMonths(income, expenses, threshold);

        assertEquals(10, restMonths);
    }

    @Test
    void calculateRestMonthsShouldReturnCorrectValueForBigNumbers() {
        Holiday service = new Holiday();

        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;

        int restMonths = service.calculateRestMonths(income, expenses, threshold);

        assertEquals(5, restMonths);
    }
}