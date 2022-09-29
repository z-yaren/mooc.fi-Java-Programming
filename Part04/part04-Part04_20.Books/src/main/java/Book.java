public class Book {

    private String title;
    private int page;
    private int pubYear;

    public Book() {
    }

    public Book(String title, int page, int pubYear){
        this.title = title;
        this.page = page;
        this.pubYear = pubYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPubYear() {
        return pubYear;
    }

    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }

    @Override
    public String toString() {
        return title + ", " + page + " pages, " + pubYear;
    }

    
    
}
