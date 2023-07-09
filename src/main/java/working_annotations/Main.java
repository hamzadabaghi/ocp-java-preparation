package working_annotations;

public class Main {

    public static void main(String[] args) {

        Engineer engineer = new Engineer("hamza", 25, new String[]{"java", "python", "c++"});
        var annotations = engineer.getClass().getAnnotations();
        for (var annotation : annotations) {
            if (annotation instanceof Version) {
                var version = (Version) annotation;
                System.out.println(version.name());
                System.out.println(version.value());
            }
        }
        System.out.println(annotations.length);
    }

}
