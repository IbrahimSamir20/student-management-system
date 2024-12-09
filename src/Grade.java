
public class Grade extends Control {

    private String courseName;
    private String grade;
    public Grade(String courseName, String grade) {
        this.courseName = courseName;
        this.grade = grade;
    }


    public int read(){
        System.out.println(grade);
        return 1;
    }


    public void create(String grade){
        this.grade = grade;

    }

    public String update(String ID, String grade){

        this.grade = grade;
        return grade;
    }


}