package object_oriented_approach.enumerations_nested_classes;

public class EnumerationsAndNestedClasses {


    public static void main(String[] args) {

        Role role = Role.ADMIN;
        System.out.println(role.name() + "--" + role.getPriority());

    }

    // define an enumeration
    enum Role {
        ADMIN(1), USER(2), GUEST(3);

        private final int priority;

        Role(int priority) {
            this.priority = priority;
        }

        public int getPriority() {
            return priority;
        }
    }
}

