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

    // 3명의 자료를 입력받는 함수
    public static Person[] inputPeople(Scanner sc, int n) {
        Person[] people = new Person[n];
        for (int i = 0; i < n; i++) {
            people[i] = inputPerson(sc);
        }
        return people;
    }

    // 이름이 사전순으로 가장 빠른 사람을 찾는 함수
    public static Person findFirstName(Person[] people) {
        Person result = people[0];

        for (int i = 1; i < people.length; i++) {
            if (people[i].name.compareTo(result.name) < 0) {
                result = people[i];
            }
        }

        return result;
    }

    // 결과를 출력하는 함수
    public static void printPerson(Person p) {
        System.out.println("name : " + p.name);
        System.out.println("tel : " + p.tel);
        System.out.println("addr : " + p.addr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person[] people = inputPeople(sc, 3);   // 3명의 자료 입력

        Person first = findFirstName(people);   // 이름이 가장 빠른 사람 찾기

        printPerson(first); // 결과 출력

        sc.close();
    }
}
