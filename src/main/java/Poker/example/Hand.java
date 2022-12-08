package Poker.example;

public final class Hand {
    private final String[] cards;

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
