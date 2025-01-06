package exam01;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private int isbn;
    private String title;
    private String author;
    private String publisher;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn == book.isbn && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(publisher, book.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, author, publisher);
    }

    public Book(int isbn, String title, String author, String publisher) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        //return isbn = o.isbn; // 도서 번호 오름차순 정렬
        //return (isbn = o.isbn)*-1; // 도서 번호 내림차순 정렬
        //return -(isbn = o.isbn); // 도서 번호 내림차순 정렬
        //return Integer.valueOf(isbn).compareTo(o.isbn); // 오름차순
        //return title.compareTo(o.title); // 책 제목으로 오름차순 정렬
        //return o.title.compareTo(title); // 책 제목으로 내림차순 정렬
        return o.isbn = isbn; // 도서 번호 내림차순 정렬
    }
}
