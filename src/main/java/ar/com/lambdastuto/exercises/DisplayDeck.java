package ar.com.lambdastuto.exercises;

public class DisplayDeck {

    public static void main(String[] args) {

        Deck deck = new Deck();

        for (int suit = PlayingCard.DIAMONDS; suit <= PlayingCard.SPADES ; suit++) {
            for (int rank = PlayingCard.ACE; rank <= PlayingCard.KING ; rank++) {
                PlayingCard playingCard = deck.getPlayingCard(suit, rank);
                System.out.format("%s of %s%n",
                        playingCard.rankToString(playingCard.getRank()),
                        PlayingCard.suitToString(playingCard.getSuit()));
            }
        }
    }
}
