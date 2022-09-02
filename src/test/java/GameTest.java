import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class GameTest {

    Game game;

    @Before
    public void setup() {
        game = new Game("hello");
    }

    @Test
    public void test01() {
        game.guess('h');
        game.guess('e');
        game.guess('l');
        game.guess('o');
        Assert.assertEquals(6, game.getRemainingTries());
        Assert.assertTrue(game.isSolved());
    }

    @Test
    public void test02() {
        game.guess('o');
        game.guess('b');
        game.guess('d');
        game.guess('g');
        game.guess('y');
        game.guess('t');
        game.guess('r');
        Assert.assertEquals(0, game.getRemainingTries());
        Assert.assertFalse(game.isSolved());
    }

    @Test
    public void test03() {
        boolean result = game.guess('w');
        Assert.assertFalse(result);
    }


    @Test
    public void test04() {
        boolean result = game.guess('h');
        Assert.assertTrue(result);
    }

    @Test(expected = NullPointerException.class)
    public void test05() {
        game.guess(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test06() {
        game.guess("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void test07() {
        game.guess('2');
    }

    @Test
    public void test08() {
        boolean resultado = game.guess("h");
        Assert.assertTrue(resultado);
        Assert.assertEquals("h----", game.getCurrentProgress());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test09() {
        boolean resultado = game.guess("h");
        Assert.assertTrue(resultado);
        game.guess("h");
    }

    @Test()
    public void test10() {
        String resultado = game.getAnswer();
        Assert.assertEquals("hello", resultado);
    }
}