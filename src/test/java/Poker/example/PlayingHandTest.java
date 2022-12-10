package Poker.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayingHandTest {

    String[] firstCards = {"AD","KD","QD","JD","TD"};
    Hand hand = new Hand(firstCards);
    PlayingHand firstHand =new PlayingHand(hand);
    String[] secondCards = {"9D","9S","QD","QS","TD"};
    Hand hand2 = new Hand(secondCards);
    PlayingHand secondHand =new PlayingHand(hand2);


    String[] firstCards2 = {"9D","3S","2D","QS","TD"};
    Hand hand3 = new Hand(firstCards2);
    PlayingHand firstHand2 =new PlayingHand(hand3);
    String[] secondCards2 = {"QD","TS","3D","2S","9D"};
    Hand hand4 = new Hand(secondCards2);
    PlayingHand secondHand2 =new PlayingHand(hand4);


    String[] firstCards3 = {"AD","KD","QD","JD","TD"};
    Hand hand5 = new Hand(firstCards3);
    PlayingHand firstHand3 =new PlayingHand(hand5);
    String[] secondCards3 = {"2S","3S","4S","5S","6S"};
    Hand hand6 = new Hand(secondCards3);
    PlayingHand secondHand3 =new PlayingHand(hand6);


    String[] firstCards4 = {"3S","3D","3H","2S","2H"};
    Hand hand7 = new Hand(firstCards4);
    PlayingHand firstHand4 =new PlayingHand(hand7);
    String[] secondCards4 = {"AD","JH","JS","AC","JD"};
    Hand hand8 = new Hand(secondCards4);
    PlayingHand secondHand4 =new PlayingHand(hand8);



    @Test
    public void testFirstHandRatingNotEqualsSecondHandRating(){

        assertFalse(firstHand.handRatingEquals(secondHand));
    }
    @Test
    public void testFirstHand2RatingEqualsSecondHandRating2(){
        assertTrue(firstHand2.handRatingEquals(secondHand2));
    }
    @Test
    public void testFirstHand3RatingNotEqualsSecondHand3Rating(){
        assertFalse(firstHand3.handRatingEquals(secondHand3));
    }
    @Test
    public void testFirstHand3RatingEqualsSecondHand3Rating(){
        assertFalse(firstHand3.handRatingEquals(secondHand3));
    }




    @Test
    public void testFirstHandtoString(){
        assertEquals("AD KD QD JD TD",firstHand.toString());
    }
    @Test
    public void testFirstHandHandNameToString(){
        assertEquals("Royal Flush",firstHand.handNameToString());
    }




    @Test
    public void testFirstHandRatingEqualsTen(){
        assertTrue(firstHand.handRatingEquals(10));
    }
    @Test
    public void testFirstHand2RatingEqualsNine(){
        assertFalse(firstHand2.handRatingEquals(9));
    }



    @Test
    public void testFirstPlayerWins(){
        assertEquals(1,firstHand.whichPlayerWins(secondHand,false));
    }
    @Test
    public void testSecondPlayer3Wins(){
        assertEquals(2,firstHand4.whichPlayerWins(secondHand4,true));
    }
    @Test
    public void testFirstPlayerTiesWithFirstPlayer(){
        assertEquals(0,firstHand4.whichPlayerWins(firstHand4,true));
    }


    @Test
    public void testFirstHandRatingIsEqualToSecondHands(){
        assertFalse(firstHand4.handRatingIsLessThan(secondHand4));
    }
    @Test
    public void testFirstHandRatingIsLessThanSecondHands(){
        assertTrue(firstHand4.handRatingIsLessThan(firstHand));
    }


}