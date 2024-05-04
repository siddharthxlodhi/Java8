package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {

        List<Integer> list2 = Stream.iterate(0, element -> element + 1).limit(20).toList(); //create Stream to list
        System.out.println(list2);

        //Filtering even numbers
        List<Integer> list = List.of(0, 1, 5, 3, 10, 5, 6, 7, 8);
        Stream<Integer> stream = list.stream();
//       List<Integer> evenList=stream.filter(i->i%2==0).collect(Collectors.toList());
        List<Integer> evenList = stream.filter(element -> element % 2 == 0).toList();
        System.out.println(evenList);

        //Filtering name with "s"
        String[] name = {"sid", "sanu", "amit"};
        List<String> list1 = Arrays.stream(name).filter(element -> element.charAt(0) == 's').toList();
        System.out.println(list1);

        //Map operation
        System.out.println(list.stream().map(e -> e * e).toList());

        //Traversing
        list.forEach(System.out::println);

        //Sorted
        list.stream().sorted((a, b) -> b - a).forEach(System.out::println); //descending

        //minimum element
        System.out.println(list.stream().min(Integer::compareTo).get());

        //

        //maximum element
        System.out.println(list.stream().max((a, b) -> a.compareTo(b)).get());

        //Distinct
        System.out.println(list.stream().distinct().toList());

        //List using limit and skip
        List<Integer> list3 = Stream.iterate(0, x -> x + 1).limit(51).skip(1).peek(System.out::println).toList();


    }
}
