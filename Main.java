public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("1984", "Джордж Оруэлл", 1949);
        Book book2 = new Book("Мастер и Маргарита", "М.А. Булгаков", 1967);

        LibraryUser user1 = new LibraryUser("Алиса", 101);
        LibraryUser user2 = new LibraryUser("Боб", 102);

        Library library = new Library("Центральная библиотека", "ул. Пушкина, д. 10");


        library.displayLibrary();
        book1.displayBook();
        book2.displayBook();
        user1.displayUser();
        user2.displayUser();

        System.out.println("\nКниги одинаковые? " + book1.getTitle().equals(book2.getTitle()));
    }
}
