package functionInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        // Normal java
        Customer maria = new Customer("Maria", "000-000-000");
        greetCustomer(maria);

        // Consumer Functional Interface - similar to void
        Customer andrew = new Customer("Andrew", "000-000-000");
        greetCustomerConsumer.accept(andrew);

        greetCustomerV2.accept(andrew, false);
    }


    // Consumer Function
    static Consumer<Customer> greetCustomerConsumer = (customer) -> System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " + customer.customerPhoneNumber);

    // Normal class method
    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " + customer.customerPhoneNumber);
    }

    // BiConsumer Functions, takes two parameters
    static BiConsumer<Customer, Boolean> greetCustomerV2 = ((customer, showPhoneNumber) -> {
        System.out.println("Hello " + customer.customerName +
                ", thanks for registering phone number " +
                (showPhoneNumber ? customer.customerPhoneNumber : "*********"));
    });



    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        // Constructor
        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
