package org.platzi.javatest.player;

import java.util.Random;

public class Dice {

    /// Atributo
    private int side;

    /// Constructor
    public Dice(int side) {
        this.side = side;
    }

    ///  Metodos
    public int roll(){
        return new Random().nextInt(side) + 1;
    }
}
