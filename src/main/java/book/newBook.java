package book;

public class newBook {
    private String name;
    private String author;
    private String size;

    public newBook(String name, String author, String size) {
        this.name = name;
        this.author = author;
        this.size = size;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

}
