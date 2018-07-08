package java8;

public class Transformer {


    private static Transformable transformable = new Transformable() {
        @Override
        public void transform(String s) {
            System.out.println(s + " transformed!");
        }
    };

    private static Transformable transformableLambda = s -> System.out.println(s + " transformed with Lambda!");

//    private static Transformable transformable = new Transformable( s -> { System.out.println(s + " transformed!") } );

    public static void main(String[] args) {

//        transformable.transform("Hello!!!");

    }

}
