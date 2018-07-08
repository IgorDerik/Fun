package java8;

public interface Payable {

    default void increasePay() {
        System.out.println("YES!!!");
    }

}
