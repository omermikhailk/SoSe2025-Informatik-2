import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;

class Aufgabe18TeilB {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(101);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] integerArray = r.ints(n, 1, 1001).toArray();

        Integer max = 0;

        for (Integer num: integerArray) {
            if (num > max) {
                max = num;
            }
            list.add(num);
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
