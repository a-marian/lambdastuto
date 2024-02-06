package ar.com.lambdastuto.exercises;

public class Deck {

    public static int numSuits= 4;
    public static int numRanks = 13;
    public static int numCards = numSuits * numRanks;

    private PlayingCard [][] playingCards;

    public Deck(){
        playingCards = new PlayingCard[numSuits][numRanks];
        for (int suit = PlayingCard.DIAMONDS; suit <= PlayingCard.SPADES ; suit++) {
            for (int rank = PlayingCard.ACE; rank <= PlayingCard.KING ; rank++) {
                playingCards[suit-1][rank-1] = new PlayingCard(rank, suit);
            }
        }
    }

    public PlayingCard getPlayingCard(int suit, int rank){
        return playingCards[suit-1][rank-1];
    }
}
