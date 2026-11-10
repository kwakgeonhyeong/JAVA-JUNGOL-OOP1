import java.util.Scanner;

class Main {

    // 이름, 전화번호, 주소를 멤버로 하는 클래스 (구조체 역할)
    static class Person {
        String name;
        String tel;
        String addr;
    }

    // 입력을 받는 함수
    public static Person inputPerson(Scanner sc) {
        Person p = new Person();
        p.name = sc.next();
        p.tel = sc.next();
        p.addr = sc.next();
        return p;
    }

    // 출력하는 함수
    public static void printPerson(Person p) {
        System.out.println("name : " + p.name);
        System.out.println("tel : " + p.tel);
        System.out.println("addr : " + p.addr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person p = inputPerson(sc); // 자료 입력
        printPerson(p);             // 결과 출력

        sc.close();
    }
}
