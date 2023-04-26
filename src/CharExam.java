public class CharExam {
    public static void main(String[] args) {
        // Q. '1' + '2' + '3' + '4' + '5' = 15가 출력되게 프로그래밍 하시오.
        int a = '1';
        int b = '2';
        int c = '3';
        int d = '4';
        int e = '5';
        int sum = (a-48) + (b-48) + (c-48) + (d-48) + (e-48);
        System.out.println("sum = " + sum);
    }
}
