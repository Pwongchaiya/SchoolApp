import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Jimmy");
        students.add("Timmy");
        students.add("Suzy");
        students.add("Martha");
        Classroom classroom = new Classroom("Johnson", "English", students);
        classroom.addStudent("Tommy");
        System.out.println(classroom.getStudents());
        classroom.addStudent("James");
        classroom.removeStudent("Tommy");
        System.out.println(classroom.getStudents());

    }
}