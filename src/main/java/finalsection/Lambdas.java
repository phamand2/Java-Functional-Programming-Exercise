package finalsection;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {

        String andrew = upperCaseName.apply("andrew", 21);
        System.out.println(andrew);


        Service test = new Service();
        test.blah.accept("hi");


    }

    //<T> – the type of the first argument to the function
    //<U> – the type of the second argument to the function
    //<R> – the type of the result of the function
    static BiFunction<String, Integer, String> upperCaseName = (name, age) -> {
        if(name.isBlank()){
            throw new IllegalArgumentException("");
        }

        return name.toUpperCase();
    };

    public static class Service {

        public static Consumer<String> blah = s -> {
            System.out.println(s);
        };
    }

}
