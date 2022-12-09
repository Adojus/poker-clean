package Poker.example;

public class Hand {
    protected String[] cards;

    public Hand(){ cards = new String[5];}
    public Hand(String[] cards) {
        this.cards = cards;
    }
    @Override
    public String toString(){
        String line;
        line = String.format("%s %s %s %s %s", (Object[]) cards);
        return line;
    }
}
