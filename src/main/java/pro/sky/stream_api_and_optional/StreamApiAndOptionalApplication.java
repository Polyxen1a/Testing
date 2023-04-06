package pro.sky.stream_api_and_optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static pro.sky.stream_api_and_optional.Stream_API_optional.evenNumbers.findEvenNumbers;

@SpringBootApplication
public class StreamApiAndOptionalApplication {

	public static void findMinMax() {
		System.out.println("Find min max");
	}

	public static void main(String[] args) {
		/* SpringApplication.run(StreamApiAndOptionalApplication.class, args);
		 */
		findMinMax();

	}
}