import java.util.Scanner;

class Main {

    // 키와 몸무게를 멤버로 하는 클래스 (구조체 역할)
    static class Person {
        double height;
        double weight;
    }

    // 한 사람(아버지 또는 어머니)의 정보를 입력받는 함수
    public static Person inputPerson(Scanner sc) {
        Person p = new Person();
        p.height = sc.nextDouble();
        p.weight = sc.nextDouble();
        return p;
    }

    // 학생의 키와 몸무게를 계산하는 함수
    public static Person calculateChild(Person father, Person mother) {
        Person child = new Person();

        child.height = (father.height + mother.height) / 2 + 5;
        child.weight = (father.weight + mother.weight) / 2 - 4.5;

        return child;
    }

    // 결과를 출력하는 함수
    public static void printResult(Person child) {
        int height = (int) child.height; // 정수 미만 버림
        double weight = Math.round(child.weight * 10) / 10.0; // 소수 첫째자리까지 반올림

        System.out.println("height : " + height + "cm");
        System.out.println("weight : " + weight + "kg");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person father = inputPerson(sc); // 아버지 정보 입력
        Person mother = inputPerson(sc); // 어머니 정보 입력

        Person child = calculateChild(father, mother); // 학생의 키, 몸무게 계산

        printResult(child); // 결과 출력

        sc.close();
    }
}
