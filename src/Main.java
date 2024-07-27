public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Валерия", "Никифорова");
        System.out.println("Автор: " + author1.getLastname() + " " + author1.getName());

        Book book1 = new Book("ЭтноВзгляд", author1, 2023);
        System.out.println("Название: " + book1.getTitle());
        System.out.println("Автор: " + book1.getAuthor().getLastname() + " " + book1.getAuthor().getName());
        System.out.println("Дата публикации: " + book1.getPublishYear());

        book1.setPublishDate(2013);
        System.out.println("Дата публикации: " + book1.getPublishYear() + "\n");

        Author author2 = new Author("Платон", "Ойунский");
        System.out.println("Автор: " + author2.getLastname() + " " + author2.getName());

        Book book2 = new Book("Нюргун Боотур Стремительный", author2, 1947);
        System.out.println("Название: " + book2.getTitle());
        System.out.println("Автор: " + book2.getAuthor().getLastname() + " " + book2.getAuthor().getName());
        System.out.println("Дата публикации: " + book2.getPublishYear());
    }
}