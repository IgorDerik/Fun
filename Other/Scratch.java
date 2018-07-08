package Other;

import java.util.Random;

public class Scratch {

    public static String getRandString(String...args) {
        Random random = new Random();
        return args[random.nextInt(args.length)];
    }

    public static void main(String[] args) {

        System.out.println( getRandString( "a", "b", "c", "d", "e", "f" ) );

        String[] strings = { "a", "b", "c", "d", "e", "f" };

        System.out.println( getRandString( strings ) );

    }

}
