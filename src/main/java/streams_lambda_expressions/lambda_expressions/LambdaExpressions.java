package streams_lambda_expressions.lambda_expressions;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExpressions {
    BigDecimal defaultPrice = new BigDecimal("4.00");

    public static void main(String[] args) {

        /* ------- capture variables in a lambda expression ------- */
        List<Product> products = ExampleData.getProducts();
        BigDecimal priceLimit = new BigDecimal("5.00");
        // priceLimit = null; // this won't work
        Predicate<Product> filterProducts = product -> product.getPrice().compareTo(priceLimit) < 0;
        // priceLimit = null; // this won't work even after declaration of the lambda expression
        products.stream()
                .filter(filterProducts)
                .forEach(System.out::println);


    }

    /* ------- this is a lambda expression ------- */
    private void ignoredProducts(List<Product> products) {
        products.stream()
                .filter(product -> product.getPrice().compareTo(this.defaultPrice) < 0)
                .forEach(System.out::println);
    }
}
