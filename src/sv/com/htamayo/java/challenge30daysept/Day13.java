package sv.com.htamayo.java.challenge30daysept;
/*
Day13: abstract class
link: https://www.hackerrank.com/challenges/30-abstract-classes/problem?isFullScreen=false
score obtained: 30 of 30
*/

import java.util.*;

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

// Declare your class here. Do not use the 'public' access modifier.
// Declare the price instance variable

class MyBook extends Book{
    String myTitle;
    String myAuthor;
    int myPrice = 0;

    /**
     *   Class Constructor
     *
     *   @param title The book's title.
     *   @param author The book's author.
     *   @param price The book's price.
     **/
    // Write your constructor here
    public MyBook(String t, String a, int p){
        super(t, a);
        myTitle = t;
        myAuthor = a;
        myPrice = p;
    }

    /**
     *   Method Name: display
     *
     *   Print the title, author, and price in the specified format.
     **/
    // Write your method here

    @Override
    public void display(){
        System.out.println("Title: "+myTitle);
        System.out.println("Author: "+myAuthor);
        System.out.println("Price: " +myPrice);
    }
}
// End class
public class Day13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
