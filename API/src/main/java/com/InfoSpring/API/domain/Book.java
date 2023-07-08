package com.InfoSpring.API.domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book extends BaseEntity {

    @Column(length = 100, columnDefinition = "varchar(100)", updatable = true, nullable = false)
    private String title;

    @Column(length = 100,columnDefinition = "varchar(100)", updatable = true, nullable = false)
    private String author;

    @Column(unique = true)
    private String isbn;

    private int numberPages;
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public static BookBuilder builder(){
        Book book = new Book();
        return new BookBuilder(book);
    }

    public static class BookBuilder {
        Book book;
        public BookBuilder(Book book) {
            this.book = book;
        }


        public BookBuilder uuid(UUID uuid) {
            this.book.setUuid(uuid);
            return this ;
        }


        public BookBuilder title(String title) {
            this.book.title = title;
            return this ;
        }

        public BookBuilder author(String author) {
            this.book.author = author;
            return this;
        }
        public BookBuilder isbn(String isbn) {
            this.book.isbn = isbn;
            return this;
        }
        public BookBuilder numberPages(int numberPages) {
            this.book.numberPages = numberPages;
            return this;
        }

        public Book build(){
            return book;
        }
    }

}
