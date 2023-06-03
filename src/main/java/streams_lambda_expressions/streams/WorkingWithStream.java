package streams_lambda_expressions.streams;

import streams_lambda_expressions.lambda_expressions.ExampleData;
import streams_lambda_expressions.lambda_expressions.Product;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WorkingWithStream {
    public static void main(String[] args) {

        List<Product> products = ExampleData.getProducts();

        /* ------------ terminal vs intermediate operations --------*/

        // intermediate

        // getting a stream from a collection
        Stream<Product> stream = products.stream().map(
                product -> {
                    System.out.println(product);
                    return product;
                }
        );


        // terminal

        stream.forEach(product -> {
        });

        System.out.println("--");

        // stream.forEach(product -> {}); you can't because the stream already was consumed

        // getting a stream from an array
        String[] array = {"one", "two", "three"};
        Stream<String> stringStream = Arrays.stream(array);

        // factory methods
        Stream<String> stringStream1 = Stream.ofNullable("Hello");
        Stream<?> stringStream2 = Stream.empty();


    }
}
