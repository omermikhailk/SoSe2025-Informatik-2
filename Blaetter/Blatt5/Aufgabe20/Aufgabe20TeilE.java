import java.util.stream.IntStream;

class Aufgabe20TeilE {
    public static void main(String[] args) {
        int sumOfOdds = IntStream.rangeClosed(1, 19).filter(i -> i % 2 == 1).sum();
        System.out.println(sumOfOdds);
    }
}
