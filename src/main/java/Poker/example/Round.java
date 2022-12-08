package Poker.example;

public final class Round {
    private final Hand firstHand;
    private final Hand secondHand;

    public Round(Hand firstHand, Hand secondHand){
        this.firstHand = firstHand;
        this.secondHand = secondHand;
    }

    public void print(){
        System.out.println(firstHand.toString()+" "+secondHand.toString());
    }
}
