package io.zipcoder;

import org.junit.Assert;

public class CatTest {
    public void testInheritance(){
        Cat c1 = new Cat();
        Assert.assertTrue(c1 instanceof Pet);
    }

    public void testSpeak() {
        //given
        String expected = "Meow!";
        Cat c1 = new Cat();
        //when
        String actual = c1.speak();
        //then
        Assert.assertEquals(expected, actual);
    }
}
