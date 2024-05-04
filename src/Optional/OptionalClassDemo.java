package Optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalClassDemo {
    public static void main(String[] args) {
        Provider provider = new Provider();

        System.out.println(provider.getName().isPresent());//print boolean

        System.out.println(provider.getName().orElse("no value"));//returns given default value if no value is present
        System.out.println(provider.getName().orElseGet(() -> "no value"));//return value by Supplied Function

        provider.getName().ifPresent(System.out::println);//if value is present can be used

        System.out.println(provider.getName().filter(e -> e.charAt(1) == 's'));//If a value is present, and the value matches the given predicate, returns an Optional describing the value, otherwise returns an empty Optional.

        provider.getName().ifPresentOrElse(System.out::println, () -> System.out.println("run"));//If a value is present, performs the given action with the value, otherwise performs the given empty-based action.
//      System.out.println(provider.getName().get()); It gives null pointer exception

//      provider.getName().orElseThrow(NoSuchElementException::new); throw given exception if no value is present
        Optional<String> optional = provider.getName();
        Optional<String> optional1 = optional.map(String::toUpperCase); //if value is present provide option with mapped data otherwise empty optional
        optional1.ifPresent(System.out::println);


    }
}
