import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;

class Aufgabe18TeilA {
    public static void main(String[] args) {
        Random r = new Random();
        int n = 0;
        while (n == 0) {
            // Sichergehen, dass n positiv waere, ansonsten koennte es auch null sein, denn
            // null ist im Startbound von nextInt enthalten
            n = r.nextInt(101);
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        Iterator<Integer> integerIterator = r.ints(n, 1, 1001).iterator();

        Integer max = 0;

        while (integerIterator.hasNext()) {
            Integer randomInt = integerIterator.next();
            if (randomInt > max) {
                max = randomInt;
            }
            list.add(randomInt);
        }

        System.out.println("Der maximale Wert der Liste ist " + max.toString());

        if (list.size() % 2 != 0) {
            System.out.println(list.get((list.size() - 1) / 2));
        }
        else {
            System.out.println("Die Anzahl der Elemente ist gerade");
        }

        Integer check = 500;
        int result = list.indexOf(check);
        if (result != -1) {
            System.out.println(result);
        }
        else {
            System.out.println("Nicht vorhanden");
        }
    }
}
