import java.util.*;
public class ListEx5 {

    public static void main(String[] args) {
        //Creating list of Books
        List<Book> list=new ArrayList<Book>();
        //Creating Books
        Book b1=new Book(11,"Let us C","Yashwant Kanetkar","BPB",18);
        Book b2=new Book(12,"Data Communications and Networking","Forouzan","Mc Graw Hill",14);
        Book b3=new Book(13,"Operating System","Galvin","Wiley",16);
        //Adding Books to list
        list.add(b1);
        list.add(b2);
        list.add(b3);
        //Traversing list
        for(Book b:list){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}