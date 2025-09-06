package org.platzi.javatest.player;

public class Player {

    /// Atributos
    private Dice dice;
    private int minNumberToWin;

    /// Cosntructor
    public Player(Dice dice, int minNumberToWin) {
        this.dice = dice;
        this.minNumberToWin = minNumberToWin;
    }

    /// Metodos
    public boolean play(){
        int diceNumbre = dice.roll();
        return diceNumbre < minNumberToWin;
    }
}
