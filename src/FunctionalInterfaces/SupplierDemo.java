package FunctionalInterfaces;

import java.nio.charset.IllegalCharsetNameException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
       //it returns only
        Supplier<Integer> suppplier = () -> 100;


        Predicate<Integer> predicate= e->e%2==0;
        Consumer<Integer> consumer=System.out::println;
        Function<Integer,Integer> function = e->e*200;


        //using ALL
        if (predicate.test(suppplier.get())){
         consumer.accept(function.apply(suppplier.get()));
        }


    }
}
