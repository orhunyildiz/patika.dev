package StreamAndLambda;

public class Book {
    private String bookName;
    private int pageNumber;
    private String author;
    private int releaseDate;

    public Book(String bookName, int pageNumber, String author, int releaseDate) {
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.author = author;
        this.releaseDate = releaseDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
}
