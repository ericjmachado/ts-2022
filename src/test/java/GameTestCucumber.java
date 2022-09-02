import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GameTestCucumber {

    Game game;

    @Given("I started the game with world {string}")
    public void iStartedTheGame(String world) throws Throwable {
        game = new Game(world);
    }

    @When("i input {string}")
    public void iInput(String letter) {
        game.guess(letter.charAt(0));
    }

    @Then("the result of game should be true")
    public void theResultOfGameShouldBeTrue() {
        Assert.assertTrue(game.isSolved());
    }

    @Then("the result of game should be false")
    public void theResultOfGameShouldBeFalse() {
        Assert.assertFalse(game.isSolved());
    }

    @Then("the remaining attempts are {int}")
    public void theRemainingAttemptsAre(int remainingTries) {
        Assert.assertEquals(remainingTries, game.getRemainingTries());
    }

    @Then("the current progress are {string}")
    public void theCurrentProgressAre(String progress) {
        Assert.assertEquals(progress, game.getCurrentProgress());
    }
}
