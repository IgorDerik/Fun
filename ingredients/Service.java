package ingredients;

import java.util.Objects;

public class Service {

    public static void yell(String word) {

        Objects.requireNonNull(word, "NULL");

        System.out.println(word+" !");

    }

}
