package FunctionalInterfaces;

import MethodConstructorRef.constructorRef.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {

        Function<String, Integer> f1 = str -> str.length();
        System.out.println(f1.apply("SIDDHARTH"));

        Function<String, String> f2 = str -> str.toUpperCase();
        System.out.println(f2.apply("sid"));

        Function<String, String> f4 = s -> s.concat("LODHI");

        //Function Chaining(andThen)
        Function<String, String> stringStringFunction = f2.andThen(f4);
        System.out.println(stringStringFunction.apply("sanu"));

        //Function 2 then Function 1(Compose)
        //Similar to f4.andThen(f2)
        Function<String, String> compose = f2.compose(f4);
        System.out.println(compose.apply("sanu"));

        Function<String, String> identity = Function.identity();

        //Use case-filter student whose age is greater than 18
        Function<List<Student>, List<Student>> f3 = list -> {
            return list.stream().filter(student -> student.getAge() > 18).toList();
        };
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Sid", 20, 50000));
        studentList.add(new Student("Sanu", 17, 50000));
        studentList.add(new Student("Pravesh", 21, 50000));
        studentList.add(new Student("Ankit", 15, 50000));
        List<Student> filteredStudents = f3.apply(studentList);
        System.out.println(filteredStudents);

        //BiFunction

        BiFunction<String, String, Integer> biFunction = (str1, str2) -> str1.length() + str2.length();
        System.out.println(biFunction.apply("SIDDHARTH", "LODHI"));

    }
}
