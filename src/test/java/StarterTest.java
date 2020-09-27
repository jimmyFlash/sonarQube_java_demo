import com.sonarcube.Starter;
import org.junit.Assert;
import org.junit.Test;

public class StarterTest {
    @Test
    public void FizzBuzzNormalNumbers() {

        Starter fb = new Starter();
        Assert.assertEquals("1", Starter.convert(1));
        Assert.assertEquals("2", Starter.convert(2));
    }

    @Test
    public void FizzBuzzThreeNumbers() {

        Starter fb = new Starter();
        Assert.assertEquals("Fizz", Starter.convert(3));
    }

    @Test
    public void FizzBuzzFiveNumbers() {

        Starter fb = new Starter();
        Assert.assertEquals("Buzz", Starter.convert(5));
    }

    @Test
    public void FizzBuzzThreeAndFiveNumbers() {

        Starter fb = new Starter();
        Assert.assertEquals("Buzz", Starter.convert(5));
    }
}
