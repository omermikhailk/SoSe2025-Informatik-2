import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;

class Aufgabe20TeilA {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        int n = 0;
        while (n == 0) {
            n = r.nextInt(101);
        }

        Iterator<Integer> integerIterator = r.ints(n, 1, 10001).iterator();
        while(integerIterator.hasNext()) {
            Integer i = integerIterator.next();
            list.add(i);
        }

        list.removeIf(i -> i % 2 == 1);
        list.forEach(i -> {
            if (i > 900) {
                System.out.println(i);
            }
        });
    }
}
