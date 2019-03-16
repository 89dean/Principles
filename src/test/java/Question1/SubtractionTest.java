package Question1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubtractionTest {

    @Test
    public void calculate() {
        Subtraction subtraction = new Subtraction();
        int result= subtraction.Minus(15,3);
        int reult2 = subtraction.Add(10,5);
        Assert.assertEquals(12,result);
        Assert.assertEquals(15,reult2);

        Subtraction subtraction1 = new Subtraction();
        int result3 = subtraction.Minus(6,4);
        Assert.assertEquals(2,result3);

        Subtraction subtraction2 = new Subtraction();
        int result4 = subtraction.Add(4,1);
        Assert.assertEquals(5,result4);

    }
}