import java.util.Random;

class Aufgabe20TeilB {
    public static void main(String[] args) {
        Random r = new Random();
        r.ints(500).skip(490).sorted().forEach(System.out::println);
    }
}
