package edu.up.cs301.pig;

import edu.up.cs301.game.infoMsg.GameState;

public class PigGameState extends GameState {
    private int playerId = 0;
    private int player0score = 0;
    private int player1score = 0;
    private int runningTotal = 0;
    private int dieVal;

    public PigGameState() {
        playerId = 0;
        player0score = 0;
        player1score = 0;
        runningTotal = 1;
        dieVal = 1;
    }

    public PigGameState(PigGameState pig) {
        this.playerId = pig.playerId;
        this.player0score = pig.player0score;
        this.player1score = pig.player1score;
        this.runningTotal = pig.runningTotal;
    }

    public int getPlayerId() {
        return this.playerId;
    }
    public int getPlayer0score() {
        return this.player0score;
    }
    public int getPlayer1score() {
        return this.player1score;
    }
    public int getRunningTotal() {
        return this.runningTotal;
    }

    public int getDieVal() {
        return this.dieVal;
    }

    public void switchTurn() {
        if (playerId == 0) {
            playerId = 1;
        }
        else {
            playerId = 0;
        }
    }

    public void setPlayer0score(int player0score) {
        this.player0score = player0score;
    }
    public void setPlayer1score(int player1score) {
        this.player1score = player1score;
    }
    public void setRunningTotal(int runningTotal) {
        this.runningTotal = runningTotal;
    }
    public void setDieVal (int dieVal) {
        this.dieVal = dieVal;
    }
}
