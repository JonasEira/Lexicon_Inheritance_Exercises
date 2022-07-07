package se.lexicon.books;

public class ReferenceBook extends Book {
    public ReferenceBook(){
        super();
        this.setCategory(Category.NOT_LOANABLE);
    }
}
