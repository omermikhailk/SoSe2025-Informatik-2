import java.util.Random;

class Aufgabe20TeilC {
    public static void main(String[] args) {
        Random r = new Random();
        r.ints(0, 99).limit(10).sorted().forEach(System.out::println);
    }
}
