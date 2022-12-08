package Poker.example;


public final class Game {
    public Game(){}
    public void compareHands(PlayingHand firstHand, PlayingHand secondHand){
        System.out.println(firstHand.toString()+"    PLAYER 1\n"+
                firstHand.handNameToString());
        System.out.println("");
        System.out.println(secondHand.toString()+"    PLAYER 2\n"+
                secondHand.handNameToString());

        if(!firstHand.handRatingEquals(secondHand)){
            if(firstHand.handRatingIsLessThan(secondHand)){
                System.out.println("\nPLAYER 2 WINS "+secondHand.handNameToString());
                Poker.playerTwo.addWin();
                return;
            }
            else {
                System.out.println("\nPLAYER 1 WINS "+firstHand.handNameToString());
                Poker.playerOne.addWin();
                return;
            }
        }
        else if(firstHand.handRatingEquals(2) || firstHand.handRatingEquals(3) ||
                firstHand.handRatingEquals(4) || firstHand.handRatingEquals(7) ||
                firstHand.handRatingEquals(8)){

            if(firstHand.whichPlayerWins(secondHand, true) == 1){
                System.out.println("\nPLAYER 1 WINS "+firstHand.handNameToString());
                Poker.playerOne.addWin();
                return;
            }
            else if(firstHand.whichPlayerWins(secondHand, true) == 2){
                System.out.println("\nPLAYER 2 WINS "+secondHand.handNameToString());
                Poker.playerTwo.addWin();
                return;
            }
            if(firstHand.whichPlayerWins(secondHand, false) == 1){
                System.out.println("\nPLAYER 1 WINS "+firstHand.handNameToString());
                Poker.playerOne.addWin();
                return;
            }
            else if(firstHand.whichPlayerWins(secondHand, false) == 2){
                System.out.println("\nPLAYER 2 WINS "+secondHand.handNameToString());
                Poker.playerTwo.addWin();
                return;
            }
            else {
                System.out.println("\nTIE");
                return;
            }
        }
        else if(firstHand.handRatingEquals(1) || firstHand.handRatingEquals(5) ||
                firstHand.handRatingEquals(6) || firstHand.handRatingEquals(9)){



            if(firstHand.whichPlayerWins(secondHand, false) == 1){


                System.out.println("\nPLAYER 1 WINS "+firstHand.handNameToString());
                Poker.playerOne.addWin();
                return;
            }
            else if(firstHand.whichPlayerWins(secondHand, false) == 2){
                System.out.println("\nPLAYER 2 WINS "+secondHand.handNameToString());
                Poker.playerTwo.addWin();
                return;
            }
            else{
                System.out.println("\nTIE");
                return;
            }
        }
        else{
            System.out.println("\nTIE");
            return;
        }

    }
}
