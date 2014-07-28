package MyTests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Artem on 28.07.2014.
 */

public class HelloTestNG {
    @Test
    public void Test()
    {
        System.out.println("Hello TestNG");
    }

    @Test
    public void Test2()
    {
        Assert.assertEquals(1, 1);
    }
}
