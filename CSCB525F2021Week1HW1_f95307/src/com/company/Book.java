package com.company;

import java.util.Comparator;

public class Book implements Comparable<Book> {
    private String title;
    private double price;
    private BookType bookType;

   public static Comparator<Book> BookPrice = (o1, o2) -> Double.compare(o1.getPrice(),o2.getPrice());
   public static Comparator<Book> BookTypeC = (o1, o2) -> o1.getBookType().compareTo(o2.getBookType());
    public static Comparator<Book> BookName = (o1, o2) -> o1.getTitle().compareTo(o2.getTitle());


    public Book(String title, double price, BookType bookType) {
        this.title = title;
        this.price = price;
        this.bookType = bookType;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public BookType getBookType() {
        return bookType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", bookType=" + bookType +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }
}
