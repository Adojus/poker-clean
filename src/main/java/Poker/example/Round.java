package Poker.example;

public final class Round {
    private final Hand FIRST_HAND;
    private final Hand SECOND_HAND;

    public Round(Hand firstHand, Hand secondHand){

        this.FIRST_HAND = firstHand;
        this.SECOND_HAND = secondHand;
    }

    public void play(){
        PlayingHand firstPlayingHand = new PlayingHand(FIRST_HAND);
        PlayingHand secondPlayingHand = new PlayingHand(SECOND_HAND);
        Game game = new Game();

        game.compareHands(firstPlayingHand,secondPlayingHand);
        System.out.println("------------------------------------");

    }
}
