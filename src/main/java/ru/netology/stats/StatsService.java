package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long sum = 0;
        for (long s : sales) {
            sum = sum + s;
        }
        return sum;
    }

    public long averageSales(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int belowAverageSales(long[] sales) {
        int quantityBelow = 0;
        long avr = averageSales(sales);
        for (long sl : sales) {
            if (sl < avr) {
                quantityBelow++;
            }
        }
        return quantityBelow;
    }

    public int higherAverageSales(long[] sales) {
        int quantityHigher = 0;
        long avr = averageSales(sales);
        for (long sl : sales) {
            if (sl > avr) {
                quantityHigher++;
            }
        }
        return quantityHigher;
    }
}
