package pro.sky.stream_api_and_optional;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

import static pro.sky.stream_api_and_optional.Stream_API_optional.FindMinMax.findMinMax;

@SpringBootApplication
public class StreamApiAndOptionalApplication {


		public static void main(String[] args) {

			List<Integer> list = new ArrayList<>();
			list.add(3);
			list.add(6);
			list.add(10);
			list.add(1);

			findMinMax(list.stream(), (v1, v2) -> v2 - v1, (v1, v2) -> System.out.println(v1 + v2));

		}
	}
