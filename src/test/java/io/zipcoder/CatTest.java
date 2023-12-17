package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void testInheritance(){
        Cat c1 = new Cat();
        Assert.assertTrue(c1 instanceof Pet);
    }

    @Test
    public void testSpeak() {
        //given
        String expected = "Meow!";
        Cat c1 = new Cat();
        //when
        String actual = c1.speak();
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
        int catCompareToCat = c1.compareTo(c1);
        int catCompareToDog = c1.compareTo(d1);
        int catCompareToFish = c1.compareTo(f1);

        //then
        Assert.assertEquals(0, catCompareToCat);
        Assert.assertEquals(1, catCompareToDog);
        Assert.assertEquals(1, catCompareToFish);
    }
}
