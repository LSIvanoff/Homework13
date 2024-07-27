public class Book {
    private final String title;
    private final Author author;
    private int publishYear;

    public Book(String title, Author author, int publishYear) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishYear() {
        return this.publishYear;
    }

    public void setPublishDate(int publishYear) {
        this.publishYear = publishYear;
    }
}
