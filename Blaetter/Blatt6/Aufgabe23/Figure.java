class Figure {
    private String name;
    private int x;
    private int y;

    public Figure() {
        this.name = "Test figure";
        this.x = 0;
        this.y = 0;
    }

    public Figure(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return this.name;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String toString() {
        String representation = "<" + this.name + ">" + " @ " + "[<" + this.x + ">, <" + this.y + ">]";
        return representation;
    }

    @Override
    public boolean equals(Figure f) {
        return (this.x == f.getX()) && (this.y == f.getY());
    }
}
