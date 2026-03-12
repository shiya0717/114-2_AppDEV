package week03;

public class ex_sum {
    public static void main(String[] args) {
        int total = 0;
        total = sumN1N(1, 10);9
        System.out.print("total : " + total);
    }
    static int sumN1N(int begin, int end) {
        int i=0;
        int total=0;
        for(i=begin ; i<=end ; i++) {
            total += i;
        }
        return total;
    }
}
