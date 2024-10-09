//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Person person = new Person("John");
//        Person person = new Person();

        Book book1 = new Book("The Gift", "Kumar", "AD4356", true);

        Library FCTLibrary = new Library();
        FCTLibrary.addLibraryItem(book1);

    }
}