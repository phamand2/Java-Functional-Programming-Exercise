package functionInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("07000000000")); // true
        System.out.println(isPhoneNumberValid("09000000000")); // false

        System.out.println(isPhoneNumberValidFunction.test("07000000000"));

        System.out.println(isPhoneNumberValidFunction.and(containsNumber3).test("07043000003"));
        System.out.println(isPhoneNumberValidFunction.or(containsNumber3).test("09043000003"));

    }

    static Predicate<String> containsNumber3 = (phoneNumber) -> phoneNumber.contains("3");

    static Predicate<String> isPhoneNumberValidFunction = (phoneNumber) -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static boolean isPhoneNumberValid (String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

}
