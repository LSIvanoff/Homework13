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
}
