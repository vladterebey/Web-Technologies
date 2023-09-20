package Lab1;

public class ProgrammerBook extends Book{
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, int edition, String language, int level)
    {
        super(title, author, price, edition);
        this.level = level;
        this.language = language;
    }

    public String toString()
    {
        return  super.toString() + "_" + language + "_" + Integer.toString(level);
    }

    public boolean equals(ProgrammerBook programmerBook)
    {
        if (programmerBook == null) {
            return false;
        }
        if (this.toString().equals(programmerBook.toString())) {
            return true;
        }
        return false;
    }

    public int hashCode()
    {
        return 100 * super.hashCode() + 10 * this.language.hashCode() + this.level;
    }
}
