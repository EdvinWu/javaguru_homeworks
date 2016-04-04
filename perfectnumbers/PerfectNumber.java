package javaguru.perfectnumbers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PerfectNumber {

    public enum STATE {
        DEFICIENT, PERFECT, ABUNDANT;
    }

    public static List<Integer> divisors(int n) {

        return IntStream
                .range(1, n + 1)
                .filter(i -> n % i == 0)
                .boxed()
                .collect(Collectors.toList());


    }


    public static STATE process(int n) {
        /*int sum = 0;

        for (int i : divisors(n)) {
            if (i != n)
                sum += i;
        }*/
        int sum = divisors(n)
                .stream()
                .filter(i-> i!= n)
                .reduce(0, (a, b) -> a + b);

        if (sum < n) {
            return STATE.DEFICIENT;
        } else if (sum == n) {
            return STATE.PERFECT;
        } else {
            return STATE.ABUNDANT;
        }
    }

}
