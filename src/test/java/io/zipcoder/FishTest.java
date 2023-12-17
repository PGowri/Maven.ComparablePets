package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class FishTest {
    public void testInheritance(){
        Fish f1 = new Fish();
        Assert.assertTrue(f1 instanceof Pet);
    }

    public void testSpeak() {
        String expected = "Fish!";
        Fish f1 = new Fish();
        String actual = f1.speak();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void TestCompareNameEqual(){
        // given
        Cat c1 = new Cat();
        Dog d1 = new Dog();
        Fish f1 = new Fish();

        // when
        int fishCompareToCat = f1.compareTo(c1);
        int fishCompareToDog = f1.compareTo(d1);
        int fishCompareToFish = f1.compareTo(f1);

        //then
        Assert.assertEquals(-1, fishCompareToCat);
        Assert.assertEquals(-1, fishCompareToDog);
        Assert.assertEquals(0, fishCompareToFish);
    }
}
