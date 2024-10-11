package com.company;

public class Main {

    public static void main(String[] args) {

        Book b1 = new Book("Godfather",30,BookType.NOVEL);
        Book b2 = new Book("The Tell-Tale Heart", 15, BookType.STORY);
        Book b3 = new Book("Leaves of grass", 12, BookType.POEMS);
        Book b4 = new Book("Oliver Twist", 20, BookType.NOVEL);

        BookStore bs1 = new BookStore("St. Vasil Levski 14",200);

        bs1.addBook(b1);
        bs1.addBook(b2);
        bs1.addBook(b3);
        bs1.addBook(b4);

        bs1.showList();
        bs1.showReversed();
        bs1.showList();
        bs1.theMostExpensiveBook();
        bs1.sortByAscendingPrice();
        bs1.showList();
        bs1.sortByTypeAndPrice();
        bs1.showList();
        bs1.sortByDescendingName();
        bs1.showList();
        bs1.lastInListByName();


    }
}
