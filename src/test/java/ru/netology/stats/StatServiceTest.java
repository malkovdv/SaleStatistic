package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatServiceTest {

    @Test

    public void findTotalSales() {
        StatService service = new StatService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        long expectedTotal = 180;
        long actualTotal = service.TotalSales(sales);

        assertEquals(expectedTotal, actualTotal);
    }

    @Test

    public void findAverageSales() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverage = 15;
        long actualAverage = service.AverageSales(sales);

        assertEquals(expectedAverage, actualAverage);
    }

    @Test

    public void shouldMinSales() {
        StatService service = new StatService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expectedMonth = 9;
        int actualMonth = service.MinSales(sales);

        assertEquals(expectedMonth, actualMonth);
    }

    @Test

    public void shouldMaxSales() {
        StatService service = new StatService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expectedMonth = 8;
        int actualMonth = service.MaxSales(sales);

        assertEquals(expectedMonth, actualMonth);
    }

    @Test

    public void shouldAllMinMonth() {
        StatService service = new StatService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int average = 15;

        int expectedMonth = 5;
        int actualMonth = service.AllMinMonth(sales, average);

        assertEquals(expectedMonth, actualMonth);
    }

    @Test

    public void shouldAllMaxMonth() {
        StatService service = new StatService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int average = 15;

        int expectedMonth = 5;
        int actualMonth = service.AllMaxMonth(sales, average);

        assertEquals(expectedMonth, actualMonth);
    }

}



