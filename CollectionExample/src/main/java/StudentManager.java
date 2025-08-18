
import  java.util.*;

public class StudentManager {
    private List<Student> studentList;
    private Set<String> studentNames;
    private Map<String, Integer> studentScore;

    public StudentManager() {
        studentList = new ArrayList<>();
        studentNames = new HashSet<>();
        studentScore = new HashMap<>();
    }

    public void addStudent(Student student, int score){
        // check duplicate
        if(studentNames.contains(student.getName())) {
            System.out.println("[Error] Student already exists");
            return;
        }
        // add student to list
        studentList.add(student);
        studentNames.add(student.getName());
        studentScore.put(student.getName(), score);
    }

    public void removeStudent(String name){
        studentNames.remove(name);
        studentList.removeIf(student -> student.getName().equals(name));
        studentScore.remove(name);
    }

    public void printAllStudents(){
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public void printStudentScore(String name){
        Integer score = studentScore.get(name);
        if (score != null) {
            System.out.println("Score of " + name + ": " + score);
        } else {
            System.out.println("[Error] Student not found");
        }
    }
}
