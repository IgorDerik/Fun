package ingredients;

import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        List<String> list = MyList.list;

        list.forEach( Service::yell );

    }

}
