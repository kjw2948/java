package excercise.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//stream 연습
public class Excercise4 {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C"};
        Stream stream1 = Arrays.stream(arr);
        stream1.forEach(System.out::println);

        //컬렉션 스트림
        ArrayList list = new ArrayList(Arrays.asList(1, 2, 3));
        System.out.println(list);

        Stream stream2 = list.stream();
        stream2.forEach(System.out::println);
        stream2.forEach(num -> System.out.println("num = "+num));

        // 스트림 Builder
        Stream streamBuilder = Stream.builder().add(1).add(2).add(3).build();
        streamBuilder.forEach(System.out::println);

        // 스트림 Generate
        Stream streamGenerate = Stream.generate(() -> "abc").limit(3);
        streamGenerate.forEach(System.out::println);

        // 스트림 iterate
        Stream streamIterate = Stream.iterate(10, k -> k * 2).limit(3);
        streamIterate.forEach(System.out::println);

        // 기본 타입 스트림
        IntStream intStream = IntStream.range(1, 5);
        intStream.forEach(System.out::println);

        // 2. 스트림 중개 연산

        // Filtering
        IntStream intStream2 = IntStream.range(1, 10).filter(n -> n % 2 == 0);
        intStream2.forEach(System.out::println);

        // Mapping
        IntStream intStream3 = IntStream.range(1, 10).map(n -> n + 1);
        intStream3.forEach(System.out::println);

        // Sorting
        IntStream intStream4 = IntStream.builder().add(5).add(1).add(2).add(3).add(4).build();
        IntStream intStreamSort = intStream4.sorted();
        intStreamSort.forEach(System.out::println);

        //3. 최종연산
        // Sum, average
        int sum = IntStream.range(1, 5).sum();
        double avg = IntStream.range(1, 5).average().getAsDouble();



    }
}
