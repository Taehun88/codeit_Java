package DataExample;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;

public class SummarizingDoubleAndLongExample {
    public static void main(String[] args) {

        List<Double> doubles = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0);
        List<Long> longs = Arrays.asList(1L, 2L, 3L, 4L, 5L);

        DoubleSummaryStatistics doubleSummaryStatistics = doubles.stream().collect(Collectors.summarizingDouble(Double::doubleValue));
        LongSummaryStatistics longSummaryStatistics = longs.stream().collect(Collectors.summarizingLong(Long::longValue));

        System.out.println("Double Summary Min = " + doubleSummaryStatistics.getMin());
        System.out.println("Double Summary Max = " + doubleSummaryStatistics.getMax());
        System.out.println("Double Summary Average = " + doubleSummaryStatistics.getAverage());
        System.out.println("Double Summary Count = " + doubleSummaryStatistics.getCount());
        System.out.println("Double Summary Sum = " + doubleSummaryStatistics.getSum());
        System.out.println("Long Summary Min = " + longSummaryStatistics.getMin());
        System.out.println("Long Summary Max = " + longSummaryStatistics.getMax());
        System.out.println("Long Summary Average = " + longSummaryStatistics.getAverage());
        System.out.println("Long Summary Count = " + longSummaryStatistics.getCount());
        System.out.println("Long Summary Sum = " + longSummaryStatistics.getSum());

    }
}
