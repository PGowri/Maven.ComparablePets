package io.zipcoder;

import org.junit.Assert;

public class DogTest {
    public void testInheritance(){
        Dog d1 = new Dog();
        Assert.assertTrue(d1 instanceof Pet);

    }
    public void testSpeak() {
        // given
        String expected = "Bark!";
        Dog d1 = new Dog();
        //when
        String actual = d1.speak();
        //then
        Assert.assertEquals(expected, actual);

    }
}
