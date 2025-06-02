import java.util.Random;
import java.util.HashSet;
import java.util.Iterator;

class Aufgabe18TeilF {
    public static void main(String[] args) {
        Random r = new Random();
        int n = 0;
        while (n == 0) {
            n = r.nextInt(101);
        }

        HashSet<Integer> set = new HashSet<Integer>();
        Iterator<Integer> integerIterator = r.ints(n, 1, 1001).iterator();

        while (integerIterator.hasNext()) {
            Integer randomInteger = integerIterator.next();
            set.add(randomInteger);
        }

        if (set.size() % 2 == 0) {
            System.out.println("Die Anzahl der Elemente ist gerade");
        }
        else {
            System.out.println("Die Anzahl der Elemente ist ungerade");
        }

        Integer testCase = 500;
        boolean resultTest = set.contains(testCase);
        if (resultTest) {
            System.out.println("500 vorhanden");
        }
        else {
            System.out.println("500 nicht vorhanden");
        }

        Integer max = 0;
        for (Integer element : set) {
            if (element > max) {
                max = element;
            }
        }

        System.out.println("Der maximale Wert in `set` ist: " + max);
    }
}
