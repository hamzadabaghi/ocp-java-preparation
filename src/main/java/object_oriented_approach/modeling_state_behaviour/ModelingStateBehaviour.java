package object_oriented_approach.modeling_state_behaviour;

public class ModelingStateBehaviour {

    public static void main(String[] args) {

        // method overloading
        Engine engine = new Engine();
        engine.start();
        engine.start(100);
        engine.start(100, "Generic Engine");
        engine.start("Generic Engine", 100);

        // passing by value
        int weight = 100;
        engine.modify(weight);
        System.out.println(weight);

        // passing by reference
        Engine engine2 = new Engine();
        engine.modify(engine2);
        System.out.println(engine2.name);
    }

    static class Engine {

        String name;
        int weight;

        Engine() {
            this.name = "Generic Engine";
            this.weight = 100;
        }

        Engine(String name, int weight) {
            this.name = name;
            this.weight = weight;
        }

        void start() {
            System.out.println("Engine Started");
        }

        void start(int weight) {
            System.out.println("engine Started, weight " + weight);
        }

        void start(int weight, String name) {
            System.out.println("weight : " + weight + ", engine name : " + name);
        }

        void start(String name, int weight) {
            System.out.println("engine name : " + name + ", weight : " + weight);
        }

        void modify(int weight) {
            weight = 10000;
        }

        void modify(Engine engine) {
            engine.name = "Modified Engine";
            engine.weight = 200;
        }

    }
}
