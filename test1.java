
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
         * int sum = sc.nextInt();
         * int sub = sc.nextInt();
         * int mul = sc.nextInt();
         * double div = sc.nextDouble();
         * String opter1 = sc.nextLine();
         * System.out.println("쓰고싶은 연산자를 입력해주세요");
         * switch(opter1){
         * case "+":
         * System.out.println("더할 숫자를 입력해주세요(-1을 입력시 종료)");
         * while(true){
         * int num = sc.nextInt();
         * if(num == -1){
         * break;
         * }
         * sum += num;
         * }
         * System.out.println("결과값" + sum);break;
         * case "-":
         * System.out.println("뺄 숫자를 입력해주세요(-1을 입력시 종료)");
         * while(true){
         * int num = sc.nextInt();
         * if(num == -1){
         * break;
         * }
         * sub -= num;
         * }
         * System.out.println("결과값" + sub);break;
         * case "*":
         * System.out.println("곱할 숫자를 입력해주세요(-1을 입력시 종료)");
         * while(true){
         * int num = sc.nextInt();
         * if(num == -1){
         * break;
         * }
         * mul *= num;
         * }
         * System.out.println("결과값" + mul);break;
         * case "/":
         * System.out.println("나눌 숫자를 입력해주세요(-1을 입력시 종료)");
         * while(true){
         * int num = sc.nextInt();
         * if(num == -1){
         * break;
         * }
         * div /= num;
         * }
         * System.out.println("결과값:" + div);break;
         * }
         */

        // ai 피드백 줄 수를 줄이는것에 초점을 잡았다

        System.out.println("첫 번째 숫자를 입력해주세요.");
        double result = sc.nextDouble();

        while (true) {

            System.out.println("연산자를 입력해주세요 (+, -, *, /)");
            System.out.println("0을 입력하면 계산을 종료합니다.");

            String opter = sc.next();

            if (opter.equals("0")) {
                break;
            }

            System.out.println("숫자를 입력해주세요.");
            double num = sc.nextDouble();

            switch (opter) {
                case "+":
                    result += num;
                    break;

                case "-":
                    result -= num;
                    break;

                case "*":
                    result *= num;
                    break;

                case "/":
                    if (num == 0) {
                        System.out.println("0으로 나눌 수 없습니다.");
                        continue;
                    }
                    result /= num;
                    break;

                default:
                    System.out.println("잘못된 연산자입니다.");
                    continue;
            }

            System.out.println("현재 결과값: " + result);
        }

        System.out.println("최종 결과값: " + result);

        sc.close();
    }
}