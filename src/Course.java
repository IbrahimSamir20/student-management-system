public class Course extends Grade {
//    private String courseName;
//    //to do: replace with student type
//    private String Student;
//    private String Instructor;
//    private String CourseGrade;
//
//    public Course(String courseName, String Student, String Instructor, String CourseGrade, String grade){
//        super(courseName, grade);
//        this.courseName= courseName;
//        this.Student=Student;
//        this.Instructor= Instructor;
//        this.CourseGrade=CourseGrade;
//    }
//
//
// public void create(Course course){
//     this.courseName= course.courseName;
//     this.Student=course.Student;
//     this.Instructor= course.Instructor;
//     this.CourseGrade=course.CourseGrade;
// }
//
// public void delete(Course course){
//
// }

    private final int courseId;
    private final String courseName;
    private final Instructor instructorInfo;
    private final Student studentInfo;
    private final Grade gradeInfo;

    public Course (int courseId,String courseName,Instructor instructorInfo,Student studentInfo,Grade gradeInfo){
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructorInfo = instructorInfo;
        this.studentInfo = studentInfo;
        this.gradeInfo = gradeInfo;
    }

    public int getCourseId() {
        return courseId;
    }
    public String getCourseName(){
        return courseName;
    }
    public Instructor getInstructorInfo(){
        return instructorInfo;
    }
    public Student getStudentInfo(){
        return studentInfo;
    }
    public Grade getGradeInfo(){
        return gradeInfo;
    }

}