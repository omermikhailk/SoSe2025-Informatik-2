import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;

class Aufgabe18TeilD {
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

        while (integerIterator.hasNext()) {
            Integer randomInt = integerIterator.next();
            list.add(randomInt);
        }

        list.sort(null);
        String max = list.getLast().toString();
        // Hier kriege ich immer eine Symbolfehlermeldung ueber getLast.
        // In https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/ArrayList.html steht es, dass
        // die Methode `getLast` existiert, aber irgendwie funktioniert das mit der Kompiler nicht.

        System.out.println("Der maximale Wert der Liste ist " + max);

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
