package object_oriented_approach.static_fields_methods_classes;

public class StaticThings {

    /*----- static fields --------*/
    static int a = 12;
    int b = 13;

    public static void main(String[] args) {

        /*----- static method --------*/
        StaticThings.staticMethod();
        Engine.start();

    }

    private static void staticMethod() {
        System.out.println(a + " FROM STATIC METHOD");
        // System.out.println(b + "FROM STATIC METHOD"); impossible
    }

    private void instanceMethod() {
        staticMethod();
        System.out.println(a + " FROM INSTANCE METHOD");
    }

    static class Engine {

        static int thrust = 100;
        int weight = 100;

        static void start() {
            System.out.println("Engine Started");
        }

    }
}
