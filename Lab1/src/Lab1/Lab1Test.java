package Lab1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

import java.util.Arrays;

public class Lab1Test {
    @Test
    public void Task1() {
        double res = Task1.f(2.0, 3.0);
        boolean ok = Double.toString(res).equals("2.4932140506105163");
        Assertions.assertTrue(ok, "Task1.1 failed");

        res = Task1.f(1.0, 1.0);
        ok = Double.toString(res).equals("1.913410905215903");
        Assertions.assertTrue(ok, "Task1.2 failed");

        res = Task1.f(0.0, 0.0);
        ok = Double.toString(res).equals("0.5");
        Assertions.assertTrue(ok, "Task1.3 failed");
    }

    @Test
    public void Task2() {

        boolean res = Task2.main(2.0, 3.0);
        boolean ok = Boolean.toString(res).equals("true");
        Assertions.assertTrue(ok, "Task2.1 failed");

        res = Task2.main(1.0, 1.0);
        ok = Boolean.toString(res).equals("true");
        Assertions.assertTrue(ok, "Task2.2 failed");

        res = Task2.main(0.0, 0.0);
        ok = Boolean.toString(res).equals("true");
        Assertions.assertTrue(ok, "Task2.3 failed");
    }

    @Test
    public void Task3() {

        double res = Task3.f(0.2);
        boolean ok = Double.toString(res).equals("0.2027100355086725");
        Assertions.assertTrue(ok, "Task3.1 failed");

        res = Task3.f(1.0);
        ok = Double.toString(res).equals("1.5574077246549023");
        Assertions.assertTrue(ok, "Task3.2 failed");

        res = Task3.f(0.0);
        ok = Double.toString(res).equals("0.0");
        Assertions.assertTrue(ok, "Task3.3 failed");
    }

    @Test
    public void Task4() {
        boolean res = Task4.isPrime(23989);
        boolean ok = Boolean.toString(res).equals("false");
        Assertions.assertTrue(ok, "Task4.1 failed");

        res = Task4.isPrime(1);
        ok = Boolean.toString(res).equals("false");
        Assertions.assertTrue(ok, "Task4.2 failed");

        res = Task4.isPrime(2);
        ok = Boolean.toString(res).equals("true");
        Assertions.assertTrue(ok, "Task4.3 failed");
    }

    @Test
    public void Task5() {

        int[] testArray1 = {1, 2, 3, 0, 2, 3, 10, 9, 11};
        int res = Task5.f(testArray1);
        boolean ok = String.valueOf(res).equals("4");
        Assertions.assertTrue(ok, "Task5.1 failed");

        int[] testArray2 = {1, 1, 2, 3, 0, 2, 3, 10, 9, 11};
        res = Task5.f(testArray2);
        ok = String.valueOf(res).equals("5");
        Assertions.assertTrue(ok, "Task5.2 failed");

        int[] testArray3 = {2, 2, 2, 7, 0, 2, 11, 10, 9, 11};
        res = Task5.f(testArray3);
        ok = String.valueOf(res).equals("6");
        Assertions.assertTrue(ok, "Task5.3 failed");
    }

    @Test
    public void Task6() {

        int[] testArray1 = {1, 2, 3, 4, 5};
        int[][] expectedMatrix = {
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 1},
                {3, 4, 5, 1, 2},
                {4, 5, 1, 2, 3},
                {5, 1, 2, 3, 4}
        };
        int[][] res = Task6.createMatrixFromArray(testArray1);
        boolean ok = Arrays.deepEquals(res, expectedMatrix);
        Assertions.assertTrue(ok, "Task6.1 failed");

        int[] testArray2 = {2, 4, 2, 1, 5, 5, 1, 9};
        int[][] expectedMatrix2 = {
                {2, 4, 2, 1, 5, 5, 1, 9},
                {4, 2, 1, 5, 5, 1, 9, 2},
                {2, 1, 5, 5, 1, 9, 2, 4},
                {1, 5, 5, 1, 9, 2, 4, 2},
                {5, 5, 1, 9, 2, 4, 2, 1},
                {5, 1, 9, 2, 4, 2, 1, 5},
                {1, 9, 2, 4, 2, 1, 5, 5},
                {9, 2, 4, 2, 1, 5, 5, 1}
        };
        res = Task6.createMatrixFromArray(testArray2);
        ok = Arrays.deepEquals(res, expectedMatrix2);
        Assertions.assertTrue(ok, "Task6.2 failed");

        int[] testArray3 = {1, 2, 3, 4, 5, 7, 1};
        int[][] expectedMatrix3 = {
                {1, 2, 3, 4, 5, 7, 1},
                {2, 3, 4, 5, 7, 1, 1},
                {3, 4, 5, 7, 1, 1, 2},
                {4, 5, 7, 1, 1, 2, 3},
                {5, 7, 1, 1, 2, 3, 4},
                {7, 1, 1, 2, 3, 4, 5},
                {1, 1, 2, 3, 4, 5, 7}
        };
        res = Task6.createMatrixFromArray(testArray3);
        ok = Arrays.deepEquals(res, expectedMatrix3);
        Assertions.assertTrue(ok, "Task6.3 failed");
    }

    @Test
    public void Test7() {

        int[] testArray1 = {1, 2, 1, 5, 3,7,4};
        int[] expectedMatrix = {1,1,2,3,4,5,7};
        int[] res = Task7.sortArray(testArray1);
        boolean ok = Arrays.equals(res, expectedMatrix);
        Assertions.assertTrue(ok, "Task7.1 failed");


        int[] testArray2 = {9, 6, 3, 1, 5, 7, 8};
        int[] expectedMatrix2 = {1, 3, 5, 6, 7, 8, 9};
        res = Task7.sortArray(testArray2);
        ok = Arrays.equals(res, expectedMatrix2);
        Assertions.assertTrue(ok, "Task7.2 failed");

        int[] testArray3 = {4, 3, 2, 1};
        int[] expectedMatrix3 = {1, 2, 3, 4};
        res = Task7.sortArray(testArray3);
        ok = Arrays.equals(res, expectedMatrix3);
        Assertions.assertTrue(ok, "Task7.3 failed");
        }

    @Test
    public void Test8() {

        int[] testArray1 = {0, 1, 1, 2, 2};
        int[] testArray2 = {1, 2, 2, 3, 3};
        int[] expectedRes = {1, 3, 3, 5, 5};
        int[] res = Task8.f(testArray1,testArray2);
        boolean ok = Arrays.equals(res, expectedRes);
        Assertions.assertTrue(ok, "Task8.1 failed");


        testArray1 = new int[]{0,0,0,0,0};
        testArray2 = new int[]{0,0,0,0,0};
        expectedRes = new int[]{0,0,0,0,0};
        res = Task8.f(testArray1, testArray2);
        ok = Arrays.equals(res, expectedRes);
        Assertions.assertTrue(ok, "Task8.2 failed");

        testArray1 = new int[]{1,2,2,3,4};
        testArray2 = new int[]{1,2,3,4,5};
        expectedRes = new int[]{0,1,3,4,5};
        res = Task8.f(testArray1,testArray2);
        ok = Arrays.equals(res, expectedRes);
        Assertions.assertTrue(ok, "Task8.3 failed");
    }

    @Test
    public void Test9() {

        Basket basket = new Basket();

        basket.add(new Ball("blue", 2));
        basket.add(new Ball("green", 3));
        basket.add(new Ball("white", 5));
        basket.add(new Ball("black", 7));
        basket.add(new Ball("blue", 11));
        int resCount = basket.countOf("blue");
        int expectedCount = 2;
        double expectedWeight = 28.0;
        double resWeight = Task9.fWeight(basket);
        boolean ok = (resWeight==expectedWeight && resCount==expectedCount);
        Assertions.assertTrue(ok, "Task8.1 failed");


        Basket basket2 = new Basket();

        basket2.add(new Ball("blue", 4));
        basket2.add(new Ball("green", 5));
        basket2.add(new Ball("white", 21));
        basket2.add(new Ball("black", 2));
        basket2.add(new Ball("blue", 10));
        resCount = basket.countOf("white");
        expectedCount = 1;
        expectedWeight = 42.0;
        resWeight = Task9.fWeight(basket2);
        ok = (resWeight==expectedWeight && resCount==expectedCount);
        Assertions.assertTrue(ok, "Task8.2 failed");
    }

/*    @Test
    public void Test12() {

        Book book1 = new Book("Title1", "Tolstoy", 1, 2);
        Book book2 = new Book("Title2", "Pushkin", 4, 6);

        String bookName1 = book1.toString();
        String bookName2 = book2.toString();

        boolean booksEquals = book1.equals(book2);

        int bookHash1 = book1.hashCode();
        int bookHash2 = book2.hashCode();

        String bookNameRes1 = "Title1_Tolstoy_1_2";
        String bookNameRes2 = "Title2_Pushkin_4_6";
        int bookHashRes1 = 2077062692;
        int bookHashRes2 =  -126658986;
        boolean booksEqualsRes = false;
        boolean ok = (bookName1.equals(bookNameRes1) && bookName2.equals(bookNameRes2) && booksEquals == booksEqualsRes && bookHash1 == bookHashRes1 && bookHash2 == bookHashRes2);
        Assertions.assertTrue(ok, "Task12.1 failed");


        Book book3 = new Book("Title3", "Gogol", 1000, 1);
        Book book4 = new Book("Title4", "Lermontov", 10, 6);

        bookName1 = book3.toString();
        bookName2 = book4.toString();

        booksEquals = book3.equals(book4);

        bookHash1 = book3.hashCode();
        bookHash2 = book4.hashCode();

        bookNameRes1 = "Title3_Gogol_1000_1";
        bookNameRes2 = "Title4_Lermontov_10_6";
        bookHashRes1 = -276810759;
        bookHashRes2 =  799581162;
        ok = (bookName1.equals(bookNameRes1) && bookName2.equals(bookNameRes2) && booksEquals == booksEqualsRes && bookHash1 == bookHashRes1 && bookHash2 == bookHashRes2);
        Assertions.assertTrue(ok, "Task12.2 failed");
    }

    @Test
    public void Test13() {
        ProgrammerBook book1 = new ProgrammerBook("Title1", "Tolstoy", 1, 2,"Russian",3);
        ProgrammerBook book2 = new ProgrammerBook("Title2", "Tolstoy", 1, 2,"Russian",3);

        String bookName1 = book1.toString();
        String bookName2 = book2.toString();

        boolean booksEquals = book1.equals(book2);

        int bookHash1 = book1.hashCode();
        int bookHash2 = book2.hashCode();

        String bookNameRes1 = "Title1_Tolstoy_1_2_Russian_3";
        String bookNameRes2 = "Title2_Tolstoy_1_2_Russian_3";
        int bookHashRes1 = -609865583;
        int bookHashRes2 =  -609765583;
        boolean booksEqualsRes = false;
        boolean ok = (bookName1.equals(bookNameRes1) && bookName2.equals(bookNameRes2) && booksEquals == booksEqualsRes && bookHash1 == bookHashRes1 && bookHash2 == bookHashRes2);
        Assertions.assertTrue(ok, "Task13.1 failed");


        ProgrammerBook book3 = new ProgrammerBook("Title3", "Kleppmann", 10, 1,"English",4);
        ProgrammerBook book4 = new ProgrammerBook("Title3", "Kleppmann", 10, 1,"English",4);

        bookName1 = book3.toString();
        bookName2 = book4.toString();

        booksEquals = book3.equals(book4);

        bookHash1 = book3.hashCode();
        bookHash2 = book4.hashCode();

        bookNameRes1 = "Title3_Kleppmann_10_1_English_4";
        bookNameRes2 = "Title3_Kleppmann_10_1_English_4";
        bookHashRes1 = -1264350472;
        bookHashRes2 = -1264350472;
        booksEqualsRes = true;
        ok = (bookName1.equals(bookNameRes1) && bookName2.equals(bookNameRes2) && booksEquals == booksEqualsRes && bookHash1 == bookHashRes1 && bookHash2 == bookHashRes2);
        Assertions.assertTrue(ok, "Task13.2 failed");
    }*/

    @Test
    public void Test14(){
        Book book = new Book("Title", "Kpeppmann", 10, 2);
        Book bookClone = book.clone();

        boolean ok = (book.toString().equals(bookClone.toString()));
        Assertions.assertTrue(ok,"Task14.1 failed");
    }

    @Test
    public void Test15(){
        ArrayList<Book> books = new ArrayList<Book>();
        Book book1 = new Book(); book1.isbn = 20;
        Book book2 = new Book(); book2.isbn = 10;
        Book book3 = new Book(); book3.isbn = 2;
        Book book4 = new Book(); book4.isbn = 11;
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.sort(Book::compareTo);

        ArrayList<Book> expectedBooks = new ArrayList<Book>();
        Book expectedBook1 = new Book(); expectedBook1.isbn = 2;
        Book expectedBook2 = new Book(); expectedBook2.isbn = 10;
        Book expectedBook3 = new Book(); expectedBook3.isbn = 11;
        Book expectedBook4 = new Book(); expectedBook4.isbn = 20;
        expectedBooks.add(expectedBook1);
        expectedBooks.add(expectedBook2);
        expectedBooks.add(expectedBook3);
        expectedBooks.add(expectedBook4);

        boolean ok = expectedBooks.toString().equals(books.toString());
        Assertions.assertTrue(ok,"Test 15 failed");
    }



/*    public void setUp() {
        books = new ArrayList<Book>();
        Book book1 = new Book("Title1", "Ivanov", 1, 3);
        Book book2 = new Book("Title2", "Petrov", 2, 2);
        Book book3 = new Book("Title3", "Sidorov", 2, 4);
        Book book4 = new Book("Title4", "Zayac", 3, 1);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
    }*/

    @Test
    public void Test16()
    {
        ArrayList<Book> books;
        books = new ArrayList<Book>();
        Book book1 = new Book("Title1", "Ivanov", 1, 3);
        Book book2 = new Book("Title2", "Petrov", 2, 2);
        Book book3 = new Book("Title3", "Sidorov", 2, 4);
        Book book4 = new Book("Title4", "Zayac", 3, 1);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        books.sort(Book::compareTitle);

        ArrayList<Book> expected = new ArrayList<Book>();
        expected.add(new Book("Title1", "Ivanov", 1, 3));
        expected.add(new Book("Title2", "Petrov", 2, 2));
        expected.add(new Book("Title3", "Sidorov", 2, 4));
        expected.add(new Book("Title4", "Zayac", 3, 1));
        assertEquals("Test 16.1 failed",expected.toString(), books.toString());

        books.sort(Book::compareTitleAuthor);

        expected = new ArrayList<Book>();
        expected.add(new Book("Title1", "Ivanov", 1, 3));
        expected.add(new Book("Title2", "Petrov", 2, 2));
        expected.add(new Book("Title3", "Sidorov", 2, 4));;
        expected.add(new Book("Title4", "Zayac", 3, 1));
        assertEquals("Test 16.2 failed",expected.toString(), books.toString());


        books.sort(Book::compareAuthorTitle);

        expected = new ArrayList<Book>();
        expected.add(new Book("Title1", "Ivanov", 1, 3));
        expected.add(new Book("Title2", "Petrov", 2, 2));
        expected.add(new Book("Title3", "Sidorov", 2, 4));
        expected.add(new Book("Title4", "Zayac", 3, 1));
        assertEquals("Test 16.3 Failed",expected.toString(), books.toString());

        books.sort(Book::compareAuthorTitlePrice);

        expected = new ArrayList<Book>();
        expected.add(new Book("Title1", "Ivanov", 1, 3));
        expected.add(new Book("Title2", "Petrov", 2, 2));
        expected.add(new Book("Title3", "Sidorov", 2, 4));
        expected.add(new Book("Title4", "Zayac", 3, 1));
        assertEquals("Test 16.4 failed",expected.toString(), books.toString());
    }
}