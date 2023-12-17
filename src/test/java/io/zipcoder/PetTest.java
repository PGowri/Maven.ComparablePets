package io.zipcoder;

import org.junit.Assert;

public class PetTest {
    public void testGetPetName() {
        //given
        String expected = "Bob";
//        Pet pet = new Pet();
        Pet pet = new Dog();
        //when is to getpetname
        String actual = pet.getPetName();
        //them assert.equal
        Assert.assertEquals(expected, actual);
    }

    public void testSetPetName() {
        //given
        String expected = "Rob";
        Pet pet = new Dog();
        // when is to setpetname
        pet.setPetName(expected);
        String actual = pet.getPetName();
        //then
        Assert.assertEquals(expected, actual);
    }



}
