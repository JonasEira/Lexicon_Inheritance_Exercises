package se.lexicon.books;

public class ChildBook extends Book implements Loanable {
    public ChildBook(){
        super();
        this.setCategory(Category.CHILD);
    }

    public ChildBook(int i) {
        super(i);
        this.setCategory(Category.CHILD);
    }

    @Override
    public void loan(){
        System.out.println("Child book, " + this.getTitle() + ", was loaned.");
    }
}
