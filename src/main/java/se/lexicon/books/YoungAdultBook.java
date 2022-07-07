package se.lexicon.books;

public class YoungAdultBook extends Book implements Loanable{
    public YoungAdultBook(){
        super();
        this.setCategory(Category.ADULT);
    }

    @Override
    public void loan() {
        System.out.println("Loaning the YoungAdult book, " + this.getTitle() + ". ");
    }
}
