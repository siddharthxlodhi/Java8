package FunctionalInterfaces;

import MethodConstructorRef.constructorRef.Student;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(5));

        Predicate<Double> isGreaterThan1Lac = salary -> salary > 100000.00;
        System.out.println(isGreaterThan1Lac.test((200000.00)));

        Predicate<String> startsWithS = str -> str.toLowerCase().charAt(0) == 's';
        System.out.println(startsWithS.test("SIDDHARTH"));


        Predicate<String> endsWithH = str -> str.toLowerCase().charAt(str.length() - 1) == 'h';
        System.out.println(endsWithH.test("SANU"));

        //AND Operation
        Predicate<String> and = startsWithS.and(endsWithH);
        System.out.println(and.test("SIDDHARTH"));

        //OR Operation
        Predicate<String> or = startsWithS.or(endsWithH);
        System.out.println(or.test("SANU"));

        //Negate
        Predicate<Integer> isBelow18 = age -> age < 18;
        System.out.println(isBelow18.negate().test(15));

        Student s1 = new Student("SIDDHARTH", 21, 100000);
        Student s2 = new Student("SANU", 17, 120000);

        //isEqual
        Predicate<Object> studentPredicate = Predicate.isEqual(s1);
        System.out.println(studentPredicate.test(s2));

        //Use Case->Allow the student if age is greater than 18

        Predicate<Student> isAllowed = student -> {
            boolean isAllow;
            return isAllow = isBelow18.negate().test(student.getAge());
        };
        System.out.println(isAllowed.test(s1));
        System.out.println(isAllowed.test(s2));


        //BiPredicate

        BiPredicate<Integer,Integer> biPredicate=(x,y)->x%2==0&&y%2==0;
        System.out.println(biPredicate.test(2,8));



    }

}
