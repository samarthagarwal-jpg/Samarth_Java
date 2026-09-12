class Library
{
    String[] books;
    int noOfBooks;

    Library()
    {
        this.books= new String[100];
        this.noOfBooks=0;
    }
    public void addBook(String book)
    {
        this.books[noOfBooks]=book;
        noOfBooks++;
        System.out.println("You added a book: "+ book);
    }
    public void issueBook(String book)
    {
        for (int i=0; i<this.books.length;i++)
        {
            
            if(this.books[i].equals(book))
            {
                System.out.println("The book hass been issued");
                this.books[i]=null;
                return;
            }
            
        }
        System.out.println("This book does not exist");

    }
    public void returnBook(String book)
    {
        System.out.println("You returned a book!");
        addBook(book);
    }
    public void showAvailableBook()
    {
        System.out.println("Showing available book!");
        for (String book: this.books)
        {
            if(book==null)
            {
                continue;
            }
            System.out.println("* " + book);
        }
    }
    
}
public class Exercise4 {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook("Math");
        lib.addBook("English");
        lib.addBook("Hindi");
        lib.showAvailableBook();
        lib.issueBook("Hindi");
        lib.showAvailableBook();
        lib.returnBook("Hindi");
        lib.showAvailableBook();

    }
    
}
