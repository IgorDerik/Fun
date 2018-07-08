package java8;

public class Employee extends Person implements Payable {

    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.increasePay();

    }

}
