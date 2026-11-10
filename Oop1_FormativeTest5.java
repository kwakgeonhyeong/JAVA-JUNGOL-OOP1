import java.util.Scanner;

class Main {

    // 이름, 세 과목 점수, 총점을 멤버로 하는 클래스 (구조체 역할)
    static class Student {
        String name;
        int score1, score2, score3;
        int total;
    }

    // n을 입력받는 함수
    public static int inputN(Scanner sc) {
        return sc.nextInt();
    }

    // 한 명의 학생 정보를 입력받는 함수
    public static Student inputStudent(Scanner sc) {
        Student s = new Student();
        s.name = sc.next();
        s.score1 = sc.nextInt();
        s.score2 = sc.nextInt();
        s.score3 = sc.nextInt();
        s.total = s.score1 + s.score2 + s.score3; // 총점 계산
        return s;
    }

    // n명의 학생 정보를 입력받는 함수
    public static Student[] inputStudents(Scanner sc, int n) {
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = inputStudent(sc);
        }
        return students;
    }

    // 총점 기준 내림차순으로 정렬하는 함수 (버블 정렬)
    public static void sortByTotal(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (students[j].total < students[j + 1].total) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    // 결과를 출력하는 함수
    public static void printStudents(Student[] students) {
        for (Student s : students) {
            System.out.println(s.name + " " + s.score1 + " " + s.score2 + " " + s.score3 + " " + s.total);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = inputN(sc);                       // n 입력
        Student[] students = inputStudents(sc, n); // n명의 학생 정보 입력

        sortByTotal(students); // 총점 기준 내림차순 정렬

        printStudents(students); // 결과 출력

        sc.close();
    }
}
