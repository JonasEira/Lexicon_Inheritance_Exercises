package se.lexicon.books;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ChildBook childBook1 = new ChildBook(10);
        childBook1.setTitle("Interesting child book");
        childBook1.setAuthor("Good Author");
        //childBook1.loan();
        YoungAdultBook yaBook1 = new YoungAdultBook();
        yaBook1.setTitle("Another interesting YA book");
        //yaBook1.loan();

        ReferenceBook rBook = new ReferenceBook();
        rBook.setTitle("This is a referencebook");

        ArrayList<Book> books = new ArrayList<>();
        books.add(childBook1);
        books.add(yaBook1);
        books.add(rBook);

        // Instance of loanable
        System.out.println("Instance of loanable:");
        for(Book b : books){
            if(b instanceof Loanable){
                System.out.println(b.getTitle());
            }
        }

        // Not loanable
        System.out.println("Not loanable:");
        for(Book b : books){
            if(!(b instanceof Loanable)){
                System.out.println(b.getTitle());
            }
        }

        // Child book filter
        System.out.println("Child book:");
        for(Book b : books){
            if(b.getCategory() == Category.CHILD){
                System.out.println(b.getTitle());
            }
        }

        // Adult book filter
        System.out.println("Adult book:");
        for(Book b : books){
            if(b.getCategory() == Category.ADULT){
                System.out.println(b.getTitle());
            }
        }


    }
}
