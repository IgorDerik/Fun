package Other;

import java.util.*;

public final class MyFinal {

    private final String string;
    private final Integer integer;
    private final ArrayList<Integer> list;

    public MyFinal(String string, Integer integer, ArrayList<Integer> list) {
        this.string = string;
        this.integer = integer;

        this.list = new ArrayList<Integer>();

        for (int i : list) {
            this.list.add(i);
        }
    }

    public String getString() {
        return string;
    }

    public Integer getInteger() {
        return integer;
    }

    public List getList() {
        return (ArrayList<Integer>) list.clone();
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1,2,3,4,5);

        MyFinal myFinal = new MyFinal("String",1,list);

        List<Integer> myList = myFinal.getList();

        myList.add(0);

        myList.forEach(System.out::println);

    }
}
