package ru.netology.stats;

public class StatService {

    public long TotalSales(long[] sales) {
        long total = 0;

        for (long monthSale : sales) {
            total += monthSale;
        }
        return total;
    }

    public long AverageSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum / sales.length;
    }

    public int MinSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1;
    }

    public int MaxSales(int[] sales) {
        int maxMonth = 0; //
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int AllMinMonth(int[] sales, int average) {
        int AllMinMonth = 0;
        for (int sale : sales) {
            if (sale < average) {
                AllMinMonth++;

            }
        }
        return AllMinMonth;
    }

    public int AllMaxMonth(int[] sales, int average) {
        int AllMaxMonth = 0;
        for (int sale : sales) {
            if (sale > average) {
                AllMaxMonth++;

            }
        }
        return AllMaxMonth;
    }
}





