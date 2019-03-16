package Question2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTest {

    @Test
    public void intergers() {
        Addition addition = new Addition();
        int result = addition.intergers(5,6);
        Assert.assertEquals(11,result);
    }
}