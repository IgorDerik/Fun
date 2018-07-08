package People;

public interface Getter<T> {

    default void test() {}

    T getProperty(Person person);

}