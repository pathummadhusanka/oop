public class Library {
    private int indexOfLastBook = 0;
    BorrowableItems[] BorrowableItemsList = new BorrowableItems[100];

    public void addLibraryItem(BorrowableItems borrowableItems) {
        BorrowableItemsList[indexOfLastBook] = borrowableItems;
        indexOfLastBook++;
    }
    
}
