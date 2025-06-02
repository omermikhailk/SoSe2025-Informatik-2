import java.util.Random;
import java.util.stream.IntStream;

class Aufgabe20TeilD {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(10001);
        if (n == 0) {
            n += 1;
        }
        
        final int rand = n;

        int divisorsAmount = (int) IntStream.rangeClosed(1, rand + 1).filter(i -> rand % i == 0).count();

        System.out.println(rand + " hat " + divisorsAmount + " echten Teiler");
    }
}
