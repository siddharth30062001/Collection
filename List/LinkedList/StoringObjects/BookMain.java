package LinkedList.StoringObjects;

import java.util.*;

public class BookMain {
    
    public static void main(String[] args) {
        
        LinkedList<Book> list=new LinkedList<>();
        Book b1=new Book(111, "Lazy", "XYZ", "BC", 21);
        Book b2=new Book(222, "Riding", "ABC", "James", 31);
        Book b3=new Book(333, "Room no-21", "Johnes", "Chopra", 200);
        list.add(b1);
        list.add(b2);
        list.add(b3);

        for (Book book : list) {
            System.out.println(book.id+" "+book.name+" "+book.author+" "+book.publisher+" "+book.quantity);
        }
    }
}
