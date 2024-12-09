public class Course extends Grade {
    private String courseName;
    //to do: replace with student type
    private String Student;
    private String Instructor;
    private String CourseGrade;

    public Course(String courseName, String Student, String Instructor, String CourseGrade, String grade){
        super(courseName, grade);
        this.courseName= courseName;
        this.Student=Student;
        this.Instructor= Instructor;
        this.CourseGrade=CourseGrade;
    }


 public void create(Course course){
     this.courseName= course.courseName;
     this.Student=course.Student;
     this.Instructor= course.Instructor;
     this.CourseGrade=course.CourseGrade;
 }

 public void delete(Course course){

 }

}