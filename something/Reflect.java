package something;

import java.lang.reflect.Field;

public class Reflect {

    public static void main(String[] args) {

        Class ourClass = Being.class;
        System.out.println(ourClass.getName());

        for (Field field : ourClass.getDeclaredFields()) {
            System.out.println(field);
        }

        Being being = new Being();

        Class beingClass = being.getClass();

        System.out.println(beingClass);

    }

}
