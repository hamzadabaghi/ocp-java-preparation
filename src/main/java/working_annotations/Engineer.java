package working_annotations;

@Version(name = "hamza", value = 2)
public class Engineer {


    private String name;
    @Version
    private int age;
    private String[] skills;


    public Engineer() {
    }

    public Engineer(String name, int age, String[] skills) {
        this.name = name;
        this.age = age;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String[] getSkills() {
        return skills;
    }

    public String toString() {
        return "Engineer: " + name + ", " + age + ", " + skills;
    }
}
