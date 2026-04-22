/*
Program Name: Pr_22
Program Description: Demonstrates custom exception for library system.
*/

class BookNotAvailableException extends Exception {
    BookNotAvailableException(String msg) {
        super(msg);
    }
}

class Library {
    int availableBooks;

    Library(int books) {
        availableBooks = books;
    }

    void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully");
        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }

    public static void main(String[] args) {
        Library lib = new Library(3);

        try {
            lib.issueBook(2); // valid
            lib.issueBook(2); // exception
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
