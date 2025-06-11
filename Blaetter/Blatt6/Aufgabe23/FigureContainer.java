import java.util.ArrayList;
import java.util.Iterator;
import java.util.Iterable;

class FigrueContainer implements Iterable {
    private ArrayList<Figure> figureList = new ArrayList<Figure>();

    public void addFigure(Figure f) {
        for (Figure a : figureList) {
            if (a.equals(f)) {
                throw new IllegalArgumentException(f.toString());
            }
            else {
                figureList.add(f);
            }
        }
    }

    @Override
    public Iterator<Figure> iterator() {
        ;
    }

    @Override
    public forEach(Consumer<Figure>) {
        ;
    }

    @Override
    public Spliterator<Figure> spliterator() {
        ;
    }
}
