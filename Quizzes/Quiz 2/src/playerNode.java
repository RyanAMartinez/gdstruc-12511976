public class playerNode {
    private player player;
    private playerNode nextPlayer;

    public playerNode(player player) {
        this.player = player;
    }

    public player getPlayer() {
        return player;
    }

    public void setPlayer(player player) {
        this.player = player;
    }

    public playerNode getNextPlayer() {
        return nextPlayer;
    }

    public void setNextPlayer(playerNode nextPlayer) {
        this.nextPlayer = nextPlayer;
    }

    @Override
    public String toString() {
        return player.toString();
    }
}
