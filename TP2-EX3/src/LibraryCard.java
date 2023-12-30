public class LibraryCard {
    private int CardNumber;
    private String CardHolderName;
    private int CardHolderID;

    public LibraryCard(int CardNumber, String CardHolderName, int CardHolderID){
        this.CardNumber = CardNumber;
        this.CardHolderName = CardHolderName;
        this.CardHolderID = CardHolderID;
    }

    public int getCardNumber(){
        return this.CardNumber;
    }
    public String getCardHolderName(){
        return this.CardHolderName;
    }
    public int getCardHolderID(){
        return this.CardHolderID;
    }

}
