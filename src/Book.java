import java.util.Objects;

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

    @Override
    public String toString() {
        return "Название: " + title + ". Автор: " + author.toString() + ". Год издания: " + publishYear;
    }

    @Override
    public boolean equals(Object c) {
        if (this == c) return true;
        if (!(c instanceof Book book)) return false;
        return publishYear ==book.publishYear && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publishYear);
    }
}
