package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

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

    @Test
    public void TestCompareNameEqual(){
        // given
        Cat c1 = new Cat();
        Dog d1 = new Dog();
        Fish f1 = new Fish();

        // when
        int dogCompareToCat = d1.compareTo(c1);
        int dogCompareToDog = d1.compareTo(d1);
        int dogCompareToFish = d1.compareTo(f1);

        //then
        Assert.assertEquals(-1, dogCompareToCat);
        Assert.assertEquals(0, dogCompareToDog);
        Assert.assertEquals(1, dogCompareToFish);
    }
}
