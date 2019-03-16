package Question2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubtractionTest {

    @Test
    public void intergers() {
        Subtraction subtraction = new Subtraction();
        int result = subtraction.intergers(8,6);
        Assert.assertEquals(2,result);
    }
}