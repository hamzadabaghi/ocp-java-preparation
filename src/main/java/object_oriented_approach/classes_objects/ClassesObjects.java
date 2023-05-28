package object_oriented_approach.classes_objects;

public class ClassesObjects {
    public static void main(String[] args) {

        JetEngine jetEngine = new JetEngine();
        System.out.println(jetEngine.name);
    }

    static class JetEngine {


        // properties
        String name;
        int thrust;
        int weight;

        // initializers

        {
            this.name = "Morocco Jet Engine";
            this.thrust = 500;
            this.weight = 500;
            System.out.println("Jet Engine Initialized");

        }

        // constructors
        public JetEngine() {
            System.out.println(this.thrust); // 500 because it is initialized before the constructor
            this.name = "Generic Jet Engine";
            this.thrust = 100;
            this.weight = 100;
        }

        JetEngine(String name, int thrust, int weight) {

            this.name = name;
            this.thrust = thrust;
            this.weight = weight;
        }
    }
}
