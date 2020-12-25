import org.junit.Assert;
import org.junit.Test;
import roy.bakery.pack.BakerySolution;

public class BakerySolutionTest {

    @Test
    public void calculateOutputTest(){
        Assert.assertEquals("9,9,5,5,3,3",BakerySolution.calculateOutput(34));
        //Assert.assertEquals("9,3",BakerySolution.calculateOutput(12));
        //Assert.assertEquals("5,5",BakerySolution.calculateOutput(10));
    }
}
