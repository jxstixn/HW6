public class Player {
    private int currentCard;

    public void Play() {
        BetMore_Game Bet = new BetMore_Game();
        currentCard = Bet.pick_card();
    }

    public int getCurrentCard() {
        return currentCard;
    }

    public void setCurrentCard(int currentCard) {
        this.currentCard = currentCard;
    }
}
