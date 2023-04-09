package pro.sky.stream_api_and_optional.Stream_API_optional;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
public class EvenNumbers {
    public static void findEvenNumbers(Integer[] sourceNumbers) {

        List<Integer> evens = new ArrayList<Integer>();
        Stream<Integer> integerStreamOf = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        for (Integer sourceNumber : sourceNumbers) {
            if (sourceNumber % 2 == 0) {
                evens.add(sourceNumber);
            }
                long count = Stream.of(sourceNumbers).filter(x -> x%2==0).count();
                System.out.println(count);
            }
            System.out.println(integerStreamOf.count());


                System.out.println("Чётные числа: " + evens);
            }
        }
