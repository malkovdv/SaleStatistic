package ru.netology.stats;

public class StatService {

    public long totalSales(long[] sales) {
        long total = 0;

        for (long monthSale : sales) {
            total += monthSale;
        }
        return total;
    }

    public long averageSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum / sales.length;
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; //
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int allMinMonth(long[] sales) {
        int allMinMonth = 0;
        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                allMinMonth++;

            }
        }
        return allMinMonth;
    }

    public int allMaxMonth(long[] sales) {
        int allMaxMonth = 0;
        for (long sale : sales) {
            if (sale > averageSales(sales)) {
                allMaxMonth++;

            }
        }
        return allMaxMonth;
    }
}





