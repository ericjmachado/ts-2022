// Create a class called GameTest that tests the Game class.

import org.junit.Assert;
import org.junit.Test;


public class GameTest {

    @Test()
    public void testGameHello() {
        Game g = new Game("hello");
        g.guess('h');
        g.guess('e');
        g.guess('l');
        g.guess('o');
        Assert.assertEquals(6, g.getRemainingTries());
        Assert.assertTrue(g.isSolved());
    }
}