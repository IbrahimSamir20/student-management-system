
import javaapplication1.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Student r=new Student();
         r.addname("osama");
         r.addage(21);
         r.addcours("software testing");
         r.addlevel("senior");
         
         System.out.print(r.getviwe());
    }
}