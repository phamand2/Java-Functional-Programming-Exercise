package functionInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = incrementByOne(0);
        System.out.println(increment);

        //Function takes 1 argument and produce 1 result

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply= multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        System.out.println(addBy1AndThenMultiplyBy10.apply(1));


        // BiFunction takes 2 argument and produce 1 result
        int incrementByAndMultiply = incrementByOneAndMultiplyBiFunction.apply(5, 10);
        System.out.println(incrementByAndMultiply);
    }


    static int incrementByOne(int number){
        return number + 1;

    }

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy){
        return (number + 1) * numToMultiplyBy;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (number, numToMultiplyBy) -> (number + 1) * numToMultiplyBy;


    static Function<Integer, Integer> incrementByOneFunction = (number) -> number + 1;

    static Function<Integer, Integer> multiplyBy10Function = (number) -> number * 10;

    static Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
            incrementByOneFunction.andThen(multiplyBy10Function);
}
