package Lab1;

public class Book implements Comparable{
    private String title;
    private String author;
    private int price;
    private int edition;
    public int isbn;

    public Book()
    {

    }

    public Book(String title, String author, int price, int edition)
    {
        this.title = title;
        this.author = author;
        this.price = price;
        this.edition = edition;
    }

    public String toString()
    {
        return title + "_" + author + "_" + Integer.toString(price) + "_" + Integer.toString(edition);
    }

    public boolean equals(Book book)
    {
        if (book == null)
            return false;
        if (this.toString().equals(book.toString()))
            return true;
        return false;
    }

    public int hashCode()
    {
        return 1000 * this.title.hashCode() + 100 * this.author.hashCode() + 10 * this.price + edition;
    }

    public Book clone()
    {
        return new Book(this.title, this.author, this.price, edition);
    }

    public int compareTo(Object o) {
        Book book = (Book)o;
        if (book == null) {
            return -1;
        }
        if (this.isbn > book.isbn) {
            return 1;
        }else
        if (this.isbn < book.isbn) {
            return -1;
        }
        return 0;
    }

    private int compareAuthor(Object o) {
        Book book = (Book)o;
        if (book == null)
            return -1;
        if (this.author.compareTo(book.author) > 0) {
            return 1;
        }
        if (this.author.compareTo(book.author) < 0) {
            return -1;
        }
        return 0;
    }

    public int compareTitle(Object o) {
        Book book = (Book)o;
        if (book == null)
            return -1;
        if (this.title.compareTo(book.title) > 0) {
            return 1;
        }
        if (this.title.compareTo(book.title) < 0) {
            return -1;
        }
        return 0;
    }

    private int comparePrice(Object o) {
        Book book = (Book)o;
        if (book == null)
            return -1;
        if (this.price > book.price) {
            return 1;
        }
        if (this.price < book.price) {
            return -1;
        }
        return 0;
    }

    public int compareTitleAuthor(Object o)
    {
        if (this.compareTitle(o) > 0) {
            return 1;
        }
        if (this.compareTitle(o) < 0) {
            return -1;
        }

        return this.compareAuthor(o);
    }

    public int compareAuthorTitle(Object o)
    {
        if (this.compareAuthor(o) > 0) {
            return 1;
        }
        if (this.compareAuthor(o) < 0) {
            return -1;
        }

        return this.compareTitle(o);
    }

    public int compareAuthorTitlePrice(Object o)
    {
        if (this.compareAuthor(o) > 0) {
            return 1;
        }
        if (this.compareAuthor(o) < 0) {
            return -1;
        }

        if (this.compareTitle(o) > 0) {
            return 1;
        }
        if (this.compareTitle(o) < 0) {
            return -1;
        }

        return this.comparePrice(o);
    }
}
