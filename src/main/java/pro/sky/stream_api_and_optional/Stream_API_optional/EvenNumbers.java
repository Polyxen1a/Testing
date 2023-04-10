package pro.sky.stream_api_and_optional.Stream_API_optional;

import java.util.stream.Stream;

public class EvenNumbers {

    public static void findEvenNumbers(Integer[] sourceNumbers) {
        long count = Stream.of(sourceNumbers).filter(x -> x % 2 == 0).count();
        System.out.println(count);
    }
}
