package org.platzi.javatest.player;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class PlayerTest {

    @Test
    public void player_Wins(){

        /// Genera un mock de la clase
        Dice dice = Mockito.mock(Dice.class);

        /// Genera un caso que siempre va ocurrir
        Mockito.when(dice.roll()).thenReturn(3);

        Player player = new Player(dice, 5);
        Assert.assertTrue(player.play());
    }


    @Test
    public void player_Lose(){
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(4);

        Player player = new Player(dice, 3);
        Assert.assertFalse(player.play());
    }

}