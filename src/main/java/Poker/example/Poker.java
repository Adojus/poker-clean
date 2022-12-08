package Poker.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public final class Poker {

    static final String FILE_TO_READ = "../poker.txt";
    static final int PLAYER_COUNT = 2;
    static final int CARDS_PER_PLAYER = 5;
    static ArrayList<Round> rounds = new ArrayList<>();

    public static Player playerOne = new Player();
    public static Player playerTwo = new Player();

    public static void main(String[] args) {

        try{
            readFile();
        }catch(IOException e){
            System.out.println("Can't read file");
            System.exit(0);
        }

        for(Round round : rounds){
            //round.print();
            round.play();
        }
        System.out.println("\n-------------------------------");
        System.out.println("Player 1 total wins: ");
        playerOne.printWins();
    }

    public static void readFile() throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(FILE_TO_READ));
        String line;

        while((line = reader.readLine()) != null){
            String[] parts = line.split(" ");

            String[] firstHandArray = new String[CARDS_PER_PLAYER];
            String[] secondHandArray = new String[CARDS_PER_PLAYER];
            for(int i = 0; i < PLAYER_COUNT * CARDS_PER_PLAYER; i++){
                if(i < CARDS_PER_PLAYER)
                    firstHandArray[i] = parts[i];
                else secondHandArray[i - CARDS_PER_PLAYER] = parts[i];
            }
            Hand firstHand = new Hand(firstHandArray);
            Hand secondHand = new Hand(secondHandArray);
            Round cards = new Round(firstHand,secondHand);
            rounds.add(cards);
        }
        reader.close();
    }

}
