import org.junit.Assert;
import org.junit.Test;

public class PinTest{
    @Test
    public void happyCase(){
        Assert.assertTrue(Main.isValidPin("12459"));
    }
    @Test
    public void pinWithCharactersIsInvalid() {
        Assert.assertFalse(Main.isValidPin("12ab3"));
    }

    @Test
    public void pinToLongIsInvalid() {
        Assert.assertFalse(Main.isValidPin("124567"));
    }

    @Test
    public void pinWithSameDigitsIsInvalid() {
        Assert.assertFalse(Main.isValidPin("11111"));
    }

    @Test
    public void pinWithTooLongAscSequence() {
        Assert.assertFalse(Main.isValidPin("12347"));
    }

    @Test
    public void pinWithTooLongDescSequence() {
        Assert.assertFalse(Main.isValidPin("98743"));
    }

    @Test
    public void pinWithValidAscSequence() {
        Assert.assertTrue(Main.isValidPin("12387"));
    }

    @Test
    public void pinWithMoreThanThreeSameDigits() {
        Assert.assertFalse(Main.isValidPin("12111"));
    }
}