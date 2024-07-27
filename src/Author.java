import java.util.Objects;

public class Author {
    private final String name;
    private final String lastname;

    public Author(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return this.name;
    }


    public String getLastname() {
        return this.lastname;
    }

    @Override
    public String toString() {
        return lastname + " " + name;
    }

    @Override
    public boolean equals(Object c) {
        if (this == c) return true;
        if (!(c instanceof Author author)) return false;
        return Objects.equals(name, author.name) && Objects.equals(lastname, author.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname);
    }
}
