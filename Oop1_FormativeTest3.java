import java.util.Scanner;

class Main {

    // 직사각형의 좌표를 멤버로 하는 클래스 (구조체 역할)
    static class Rect {
        int x, y, x2, y2;
    }

    // 직사각형 정보를 입력받는 함수
    public static Rect inputRect(Scanner sc) {
        Rect r = new Rect();
        r.x = sc.nextInt();
        r.y = sc.nextInt();
        r.x2 = sc.nextInt();
        r.y2 = sc.nextInt();
        return r;
    }

    // 두 직사각형을 포함하는 최소의 직사각형을 구하는 함수
    public static Rect getMinBoundingRect(Rect r1, Rect r2) {
        Rect result = new Rect();

        result.x = Math.min(r1.x, r2.x);
        result.y = Math.min(r1.y, r2.y);
        result.x2 = Math.max(r1.x2, r2.x2);
        result.y2 = Math.max(r1.y2, r2.y2);

        return result;
    }

    // 결과를 출력하는 함수
    public static void printRect(Rect r) {
        System.out.println(r.x + " " + r.y + " " + r.x2 + " " + r.y2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rect r1 = inputRect(sc); // 첫 번째 직사각형 입력
        Rect r2 = inputRect(sc); // 두 번째 직사각형 입력

        Rect result = getMinBoundingRect(r1, r2); // 최소 포함 직사각형 계산

        printRect(result); // 결과 출력

        sc.close();
    }
}
