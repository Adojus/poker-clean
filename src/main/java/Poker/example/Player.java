package Poker.example;


public final class Player {

    private int winCount=0;
    public Player(){}

    public void addWin(){
        winCount +=1;
    }
    public void printWins(){
        System.out.println(winCount);
    }
}
