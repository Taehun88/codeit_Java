import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StudentManager studentManager = new StudentManager();
        Scanner sc = new Scanner(System.in);

        boolean run = true;

        while (run) {
            System.out.print("\\n ====== 메뉴 ====== \\n");
            System.out.println("1. 학생 등록");
            System.out.println("2. 학생 삭제");
            System.out.println("3. 학생 목록 보기");
            System.out.println("4. 학생 점수 조회");
            System.out.println("5. 종료");
            System.out.print("메뉴 선택: ");

            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("이름 입력: ");
                    String name = sc.nextLine();

                    System.out.println("나이 입력: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.println("학번 입력: ");
                    String studentId = sc.nextLine();

                    System.out.println("점수 입력: ");
                    int score = sc.nextInt();
                    sc.nextLine();

                    Student student = new Student(name, age, studentId);
                    studentManager.addStudent(student, score);
                    break;

                case 2:
                    System.out.println("삭제할 학생 이름 입력: ");
                    String removeName = sc.nextLine();
                    studentManager.removeStudent(removeName);
                    break;

                case 3:
                    System.out.println("학생 목록:");
                    studentManager.printAllStudents();
                    break;

                case 4:
                    System.out.println("조회할 학생 이름 입력: ");
                    String queryName = sc.nextLine();
                    studentManager.printStudentScore(queryName);
                    break;

                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    run = false;
                    break;

                default:
                    System.out.println("[Error] 잘못된 메뉴 선택입니다. 다시 시도하세요.");
            }
        }

    }
}
