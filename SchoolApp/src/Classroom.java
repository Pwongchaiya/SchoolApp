import java.util.Arrays;
import java.util.List;

public class Classroom{
    private String teacherName;
    private String subject;
    private static List<String> students;

    public Classroom(String teacherName, String subject, List<String> students) {
        this.teacherName = teacherName;
        this.subject = subject;
        this.students = students;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<String> getStudents() {
        return students;
    }

    public void setStudents(List<String> students) {
        this.students = students;
    }

    public static void addStudent(String student){
        if(students.size() < 5){
            students.add(student);
        }else {
            System.out.println("Class is full");
        }
    }

    public static void removeStudent(String student){
        if (students.contains(student)){
            students.remove(student);
        }else {
            System.out.println("Student does not exist");
        }
    }
}