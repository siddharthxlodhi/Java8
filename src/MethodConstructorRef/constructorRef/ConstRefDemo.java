package MethodConstructorRef.constructorRef;

import java.util.List;

public class ConstRefDemo {
    public static void main(String[] args) {
//        Provider provider = Student::new;
//        Student student = provider.getStudent(); //Referring Constructor of Student
//        student.display();

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        list.stream().forEach(e -> System.out.println(e));
        list.stream().forEach(System.out::println);
        list.forEach(System.out::println);


    }
}
