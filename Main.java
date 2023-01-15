import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        TreeSet<Book> books = new TreeSet<>();      //Not ordered set
        books.add(new Book("Ali'nin gunlugu","Ali",356,2021));
        books.add(new Book("Life is hard","Batuhan",269,1946));
        books.add(new Book("Good things will happen","Ozsurmeli",602,2023));
        books.add(new Book("Keep Calm","mralibatu",342,2000));


        TreeSet<Book> booksNew = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getNumberOfPages()-o2.getNumberOfPages();
            }
        });

        booksNew.addAll(books);  //Ordered set

        for(Book book : books){
            System.out.println(book.getBookName());
        }
        System.out.println("*********************************************");
        for (Book book : booksNew){
            System.out.println(book.getNumberOfPages());
        }
    }
}