package book;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

class Book {
    private String name;
    private String author;
    private String size;

    public Book(String name, String author, String size) {
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

@Component
class BookStorage {
    ArrayList<Book> list;

    public BookStorage() {
        list = new ArrayList<>();
    }

    public ArrayList<Book> testList() {
        return list;
    }

    public boolean isEmpty() {
        if (list.isEmpty()) {
            return true;
        }
        return false;
    }

    public void add(String name, String author, String size) {
        list.add(new Book(name, author, size));
    }

    public ArrayList<Book> get() {
        return list;
    }

    public void removeByName(String name) {
        for (int i=0; i<list.size(); i++) {
            if (name.equals(list.get(i).getName())) {
                list.remove(i);
            }
        }
    }
}