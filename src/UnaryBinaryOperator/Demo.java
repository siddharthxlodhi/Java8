package UnaryBinaryOperator;

import javax.xml.transform.Source;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Demo {
    public static void main(String[] args) {
//        Function<Integer,Integer> function=x->x*x;
//        Function<String,String> function1= String::toUpperCase;

        //In this case TypeOf(parameter=returnType) Unary operator is used

        UnaryOperator<Integer> u1 = x -> x + 1;
        System.out.println(u1.apply(5));
        UnaryOperator<String> u2 = String::toLowerCase;
        System.out.println(u2.apply("sid"));


//        BiFunction<String,String,String> biFunction=(str,str1)->str+str1;
        //In this case TypeOf(parameters=returnType) BINARY operator is used

        BinaryOperator<String> b1 = (str1, str2) -> str1 + str2;
        System.out.println(b1.apply("SIDDHARTH ", "LODHI"));
    }
}
