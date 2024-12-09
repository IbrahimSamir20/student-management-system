public class Student {
    private String name;
    private String id;
    private String course;
    private int age;
    private String level;

    public void addname(String n) {
        name = n;
    }

    public void addcours(String c) {
        course = c;
    }

    public void addage(int a) {
        age = a;
    }

    public void addlevel(String l) {
        level = l;
    }

    public String getname() {
        return name;
    }

    public String getcourse() {
        return course;
    }

    public int getage() {
        return age;
    }

    public String getlevel() {
        return level;
    }

    public String getviwe() {
        return name + " " + course + " " + age + " " + level;
    }
}
