package FunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {

        //it consumes the given data
        Consumer<String> consumer = System.out::println;
        consumer.accept("String");

        Consumer<List<Integer>> consumer1 = list -> list.forEach(e -> System.out.println(e * 100));
        consumer1.accept(List.of(1, 2, 3, 4, 5, 6, 7));

        Consumer<List<Integer>> consumer2 = list1 -> list1.forEach(e -> System.out.println(e * 200));


        //ConsumerChaining(andThen)
        consumer1.andThen(consumer2).accept(List.of(1, 2, 3, 4, 5, 6, 7,8,9));

        //BiConsumer
        BiConsumer<Integer,Integer> biConsumer=(x,y)-> System.out.println(x+y);
        biConsumer.accept(4,7);


    }
}
