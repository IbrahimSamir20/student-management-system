import java.util.ArrayList;

public class DataStorage {
    private ArrayList<Instructor> instructorList;
    private ArrayList<Grade> gradesList;
    private ArrayList<Course> courseList;
    private ArrayList<Student> studentsList;

    public DataStorage (){
        this.instructorList = new ArrayList<>();
        this.courseList = new ArrayList<>();
        this.gradesList = new ArrayList<>();
        this.studentsList = new ArrayList<>();
    }

    //Set Student ArrList
    public void setStudentsList(ArrayList<Student> studentsList){
        this.studentsList = studentsList;
    }
    //Get Student ArrList
    public ArrayList<Student> getStudentsList(){
        return studentsList;
    }

    //Set Instructor ArrList
    public void setInstructorList(ArrayList<Instructor> instructorList){
        this.instructorList = instructorList;
    }
    //Get Instructor ArrList
    public ArrayList<Instructor> getInstructorList(){
        return instructorList;
    }

    //Set Grad ArrList
    public void setGradesList(ArrayList<Grade> gradesList){
        this.gradesList = gradesList;
    }
    //Get Grad ArrList
    public ArrayList<Grade> getGradesList(){
        return gradesList;
    }

    public void setCourseList (ArrayList<Course> courseList){
        this.courseList = courseList;
    }

}
