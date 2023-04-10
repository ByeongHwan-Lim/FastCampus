public class Operator {
    // 두 과목의 점수를 이용하여 총점과 평균을 출력하는 JavaSE 프로그램을 만들어보자.
    public static void main(String[] args) {
        int kor, eng;
        kor = 77;
        eng = 87;
        int sum, avg;
        sum = kor + eng;
        avg = sum / 2;
        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + avg);
    }

}
