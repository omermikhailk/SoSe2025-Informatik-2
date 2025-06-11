import java.time.LocalDate;

class Buch {
    private final String title;
    private final String author;
    private LocalDate returnDate;
    private boolean canBeLoaned;

    public Buch(String author, String titel) {
        if (author == null || author.isEmpty()) {
            throw new IllegalArgumentException("Author can't be blank!");
        }
        if (titel == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title can't be blank!");
        }
        this.author = author;
        this.title = title;
        this.returnDate = null;
        this.canBeLoaned = true;
    }
}
