package streams_lambda_expressions.streams;

import streams_lambda_expressions.lambda_expressions.ExampleData;
import streams_lambda_expressions.lambda_expressions.Product;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsInDepth {
    public static void main(String[] args) {

        List<Product> products = ExampleData.getProducts();

        /* ----- creating stream from a collection -------- */
        var streamProduct = products.stream();

        /* ----- creating stream from an array ----------- */
        int[] numbers = {1, 2, 4};
        var streamNumbers = Arrays.stream(numbers);

        /*------ factory methods : Stream.of (varargs) ---- */
        var streamArbitraryObjects = Stream.of("Hi", "How are you", "?");

        /*------ infinite streams with generate --------- */
        var infiniteStreamRandomNumbers = Stream.generate(Math::random);
        //infiniteStreamRandomNumbers.forEach(System.out::println);

        /*------ infinite streams with iterate --------- */
        var secondInfiniteStream = Stream.iterate(1, n -> n + 1);
        // secondInfiniteStream.limit(1_000_000).forEach(System.out::println);


        /* ------ mapping elements : map ----------- */
        //products.stream().map(Product::getPrice).forEach(System.out::println);


        /* ------ mapping elements : flatmap ----------- */
        var streamOfIntegers = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
        //streamOfIntegers.flatMap(list -> list.stream()).forEach(System.out::println);
        // each list of our stream is converted to another stream of integers


        /* --------- filtering elements : filter  --------- */
        //products.stream().filter(p -> p.getPrice().compareTo(new BigDecimal(8)) > 0).forEach(System.out::println);


        /* ----- slicing streams : limit ---------- */
        //products.stream().limit(4).forEach(p -> System.out.println(p.getName()) );


        /* ----- slicing streams : skip ---------- */
        //products.stream().skip(1).forEach(p -> System.out.println(p.getName()) ); // skips the first


        /* -----  skip : pagination use case ---------- */

        // all the items
        //products.stream().forEach(product -> System.out.println(product));

        //System.out.println("------ paginated ------");

        // 5 item / page, 3rd page
        var page = 3;
        var size = 5;
        //products.stream().skip( size * (page-1)).limit(size).forEach(System.out::println);


        /* ---------- slicing using takeWhile ------ */
        //products.stream().takeWhile(p -> p.getPrice().intValue() < 10 ).forEach(System.out::println);


        /* ---------- slicing using dropWhile -------- */
        //products.stream().dropWhile(p -> p.getCategory() == Category.FOOD ).forEach(System.out::println);


        /* ------- sorting array ----------- */

        //products.stream().sorted(Comparator.comparing(Product::getPrice).reversed()).forEach(System.out::println);


    }
}
