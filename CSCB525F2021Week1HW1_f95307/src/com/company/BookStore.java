package com.company;

import java.util.*;

public class BookStore {
    private String address;
    private double area;
    private List<Book> bookList;




    public BookStore(String address, double area) {
        this.address = address;
        this.area = area;
        this.bookList = new ArrayList<>();

    }
     public BookStore(BookStore bookStore){
         this.address = bookStore.getAddress();
         this.area = bookStore.getArea();
         this.bookList = new ArrayList<>(getBookList());

     }

    public String getAddress() {
        return address;
    }

    public double getArea() {
        return area;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void addBook(Book book){
        this.bookList.add(book);
    }

    public void removeBook(Book book){
        if(this.bookList.contains(book))
            this.bookList.remove(book);
        else
            System.out.println("Book isn't in the list to be removed.");
    }

    public void showList(){
        ListIterator<Book> listIterator = this.bookList.listIterator();
        while(listIterator.hasNext())
            System.out.println(listIterator.next());
    }

    public void showReversed(){
    ListIterator<Book> listIterator = this.bookList.listIterator(bookList.size());
    while(listIterator.hasPrevious())
        System.out.println(listIterator.previous());
    }


    public void theMostExpensiveBook(){
        Collections.max(this.bookList,Book.BookPrice);
    }

    public void sortByAscendingPrice(){
        Collections.sort(this.bookList,Book.BookPrice);
    }
    public void sortByDescendingName(){
        Collections.sort(this.bookList,Book.BookName.reversed());
    }
    public void sortByTypeAndPrice(){
        Collections.sort(this.bookList,Book.BookTypeC.thenComparing(Book.BookPrice.reversed()));
    }

    public void lastInListByName(){
        ListIterator<Book> listIterator = this.bookList.listIterator(bookList.size());
        if(listIterator.hasPrevious())
            System.out.println(listIterator.previous());

        }
    }

