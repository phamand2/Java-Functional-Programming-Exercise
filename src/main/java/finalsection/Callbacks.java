package finalsection;

import java.util.function.Consumer;
import java.util.function.Function;

public class Callbacks {
    public static void main(String[] args) {

        hello("andrew", null, value -> {
            System.out.println("No lastname provided for " + value);
        });

    }

    static void hello(String firstName, String lastName, Consumer<String> callback){
        System.out.println(firstName);
        if (lastName != null){
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }
}
