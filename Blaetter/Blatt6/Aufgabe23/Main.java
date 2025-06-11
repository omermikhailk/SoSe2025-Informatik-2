class Main {
    public static void main(String[] args) {
        FigureContainer figCon = new FigureContainer();
        Figure f1 = new Figure();
        try {
            figCon.add(f1);
        }
        Figure f2 = new Figure("Small Python", 1, 1);
        f2.move(-1, -1);
        figCon.toStream() // Bin mir hier nicht sicher?
    }
}
