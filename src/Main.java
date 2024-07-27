public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Валерия", "Никифорова");
        Author author2 = new Author("Платон", "Ойунский");
        Author author3 = new Author("Платон", "Ойунский");

        Book book1 = new Book("ЭтноВзгляд", author1, 2023);
        Book book2 = new Book("Нюргун Боотур Стремительный", author2, 1947);
        Book book3 = new Book("Великий Кудангса", author3, 1930);

        book1.setPublishDate(2013);

        System.out.println();
        System.out.println(book1.toString());
        System.out.println();
        System.out.println(book2.toString());
        System.out.println();

        System.out.println(book3.equals(book1));
        System.out.println(author3.equals(author2));
    }
}