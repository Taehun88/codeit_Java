package OOPLecture.Example01;


class Student{
    String name;
    int mathScore;
    int engScore;
    int scienceScore;

    Student(String name, int mathScore, int engScore, int scienceScore) {
        this.name = name;
        this.mathScore = mathScore;
        this.engScore = engScore;
        this.scienceScore = scienceScore;
    }

    double gerAverage(){
        return (mathScore + engScore) / 2.0;
    }
}
public class OOPGradeManager {
    public static void main(String[] args){
        Student[] students = {
            new Student("Alice", 90, 95, 92),
            new Student("Bob", 80, 75, 78),
            new Student("Charlie", 85, 88, 90)
        };

        for(Student student : students){
            System.out.printf("%s 평균: %.1f\n", student.name, student.gerAverage());
        }
    }
}
